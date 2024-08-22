<?php
namespace App\Http\Controllers;

use App\Models\Curso;
use App\Models\Matricula;
use Illuminate\Http\Request;

class MatriculaController extends Controller
{
    // Matricular um aluno em um curso
    public function store(Request $request, Curso $curso)
    {
        $aluno = auth()->user(); // Aluno autenticado

        // Verificar se o aluno já está matriculado no curso
        if (!$curso->alunos->contains($aluno->id)) {
            Matricula::create([
                'user_id' => $aluno->id,
                'curso_id' => $curso->id,
            ]);

            return redirect()->route('cursos.show', $curso->id)->with('success', 'Matriculado com sucesso no curso!');
        }

        return redirect()->route('cursos.show', $curso->id)->with('error', 'Você já está matriculado neste curso.');
    }
}
