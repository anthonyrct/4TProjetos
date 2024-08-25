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

            // Cria a nova matrícula se o usuário ainda não estiver matriculado
            Matricula::create([
                'aluno_id' => $usuario->id,
                'curso_id' => $curso->id,
                'status' => 'pendente',
            ]);

            return redirect()->route('cursos.show', $curso->id)
                ->with('success', 'Matrícula realizada com sucesso.');
        }
}
