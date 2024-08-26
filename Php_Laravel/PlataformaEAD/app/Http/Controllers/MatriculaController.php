<?php

namespace App\Http\Controllers;

use App\Models\Curso;
use App\Models\Matricula;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Auth;

class MatriculaController extends Controller
{
    public function add(Curso $curso)
    {
        $usuario = Auth::user();

        // Verifica se o usuário já está matriculado
        $jaMatriculado = Matricula::where('aluno_id', $usuario->id)
                                  ->where('curso_id', $curso->id)
                                  ->exists();

        if (!$jaMatriculado) {
            // Cria a nova matrícula se o usuário ainda não estiver matriculado
            Matricula::create([
                'aluno_id' => $usuario->id,
                'curso_id' => $curso->id,
                'status' => 'pendente',
            ]);

            // Define a mensagem de sucesso
            return redirect()->route('cursos.show', $curso->id)
                             ->with('success', 'Matrícula realizada com sucesso.');
        } else {
            // Define uma mensagem de aviso se o usuário já estiver matriculado
            return redirect()->route('cursos.show', $curso->id)
                             ->with('warning', 'Você já está matriculado neste curso.');
        }
    }
}
