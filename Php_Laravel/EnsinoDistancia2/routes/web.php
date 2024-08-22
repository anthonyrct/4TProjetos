<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\CursoController;
use App\Http\Controllers\MatriculaController;
use App\Http\Controllers\DashboardController;


Route::resource('cursos', CursosController::class);
Route::post('cursos/{curso}/matricular', [MatriculaController::class, 'store'])->name('cursos.matricular');

Route::middleware('role:aluno')->group(function () {
    Route::get('/dashboard/aluno', [DashboardController::class, 'dashboardAluno'])->name('dashboard.aluno');
});

Route::middleware('role:professor')->group(function () {
    Route::get('/dashboard/professor', [DashboardController::class, 'dashboardProfessor'])->name('dashboard.professor');
});

Route::get('/ajuda', function () {
    return view('help');
});
Route::get('/', function () {
    return view('welcome');
});
