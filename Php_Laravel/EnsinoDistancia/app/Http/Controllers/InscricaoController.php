<?php

namespace App\Http\Controllers;

use App\Models\Cursos;
use App\Models\Inscricao;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Auth;

class InscricaoController extends Controller
{
    public function add(Request $request, Cursos $cursos){
        $inscricao = Inscricao::create([
            'usuario_id' => Auth::id(), 'cursos_id' =>$cursos->id
        ]);

        return redirect()->route('cursos.show', $inscricao->id)
        ->with('success', 'Inscricao adicionada com sucesso.');
}
}
