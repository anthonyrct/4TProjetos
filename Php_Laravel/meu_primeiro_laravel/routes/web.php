<?php

use Illuminate\Support\Facades\Route;

Route::get('/', function () {
    return 'Hello world';
});

Route::get('/hello', function(){
    return 'olá mundo';
});
