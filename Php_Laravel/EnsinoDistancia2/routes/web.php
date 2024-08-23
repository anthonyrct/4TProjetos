<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\CursosController;
use App\Http\Controllers\MatriculaController;
use App\Http\Controllers\DashboardController;
use App\Http\Controllers\UsuarioController;

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
    return view('Home');
});

Route::get('/register', [UsuarioController::class, 'showRegistroForm'])->name('register');


//rotas dos middlewares para quando o usuario estiver autenticado
Route::group(['middleware' => ['auth']], function () {
    Route::get('/dashboard/aluno', [DashboardController::class, 'dashboardAluno']);
    Route::get('/dashboard/professor', [DashboardController::class, 'dashboardProfessor']);
});
