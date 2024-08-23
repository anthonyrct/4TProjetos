<?php

namespace App\Http\Controllers;

use App\Models\Curso;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Auth;

class DashboardController extends Controller
{
    // Dashboard para Alunos Listar cursos matriculados
    public function dashboardAluno()
    {
        $aluno = auth::user();
        $cursos = $aluno->cursosMatriculados; // Cursos nos quais o aluno está matriculado
        return view('dashboards.aluno', compact('cursos'));
    }

    // Dashboard para Professores Listar cursos criados
    public function dashboardProfessor()
    {
        $professor = Auth::user();
        $cursos = $professor->cursos; // Cursos criados pelo professor
        return view('dashboards.professor', compact('cursos'));
    }
}
