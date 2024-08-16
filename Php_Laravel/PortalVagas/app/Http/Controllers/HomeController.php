<?php

namespace App\Http\Controllers;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use App\Models\Vagas;

class HomeController extends Controller
{
    public function index(){
        $vagas = Vagas::latest()->take(3)->get();
        return view('home',compact('vagas'));
    }
}
