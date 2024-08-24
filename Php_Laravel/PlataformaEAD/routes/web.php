<?php

use App\Http\Controllers\DashboardController;
use App\Http\Controllers\HomeController;
use Illuminate\Support\Facades\Route;

use App\Http\Controllers\UsuarioController;

// Rota para a página inicial
Route::get('', [HomeController::class, 'index'])->name('home');

// Rota para exibir o formulário de login
Route::get('/login', [UsuarioController::class, 'showLoginForm'])->name('usuarios.login');

// Rota para processar o login
Route::post('/login', [UsuarioController::class, 'login'])->name('usuarios.login');

// Rota para exibir o formulário de registro
Route::get('/registro', [UsuarioController::class, 'showRegistroForm'])->name('usuarios.registro');

// Rota para processar o registro
Route::post('/registro', [UsuarioController::class, 'registro'])->name('usuarios.registro'); // Alterado de 'register' para 'registro'

// Rota para logout
Route::post('/logout', [UsuarioController::class, 'logout'])->name('usuarios.logout');

Route::get('/dashboard', [DashboardController::class, 'index'])
    ->middleware('auth')
    ->name('usuarios.dashboard');

