<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Cursos;
class HomeController extends Controller
{
    public function index(){
        $cursos = Cursos::latest()->take(3)->get();
        return view('home',compact('cursos'));
    }
}
