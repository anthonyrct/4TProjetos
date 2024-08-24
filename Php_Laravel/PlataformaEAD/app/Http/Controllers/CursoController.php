<?php

namespace App\Http\Controllers;

use App\Models\Curso;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Auth;

class CursoController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        $professor = Auth::user()->titulo;
        $cursos = Curso::where('professor', $professor)->get();

        return view('cursos.index', compact('cursos'));
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        return view('cursos.create');
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        $dados = $request->validate([
            'titulo'=> 'required|max:100',
            'descricao'=> 'required',
            'categoria'=> 'required',
            'preco'=>'required|numeric',
        ]);
        Curso::create($dados);

        return redirect()->route('cursos.index')
            ->with('success', 'Curso criado com sucesso.');
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(Curso $curso) // Corrigido de 'cursos' para 'curso'
    {
        return view('cursos.edit', compact('curso')); // Corrigido para passar 'curso'
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Curso $curso)
    {
        $dados = $request->validate([
            'titulo'=> 'required|max:100',
            'descricao'=> 'required',
            'categoria'=> 'required',
            'preco'=>'required|numeric',
        ]);
        $curso->update($dados);

        return redirect()->route('cursos.index')
            ->with('success', 'Curso Atualizado com sucesso.');
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Curso $curso)
    {
         // Deleta o curso
         $curso->delete();

         return redirect()->route('cursos.index')
             ->with('success', 'Curso deletado com sucesso.');
    }
}
