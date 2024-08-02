<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\ProdutoController;

Route::get('/', function () {
    return view('hello-world');
});

Route::get('/produto', function (){
    return view('produto');
});

Route::get('', function (){})

Route::get('/contato', function(){
    return view('contato');
});

Route::get('/login', function(){
    return view('login');
});

Route::get('/cadastro', function(){
    return view('cadastro');
});

