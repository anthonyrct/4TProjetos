<?php

namespace App\Http\Controllers;

use Illuminate\Support\Facades\Auth;
use Illuminate\Http\Request;
use App\Models\Cursos;

class CursosController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        $professor = Auth::user()->nome_professor;
        $cursos = Cursos::where('cursos', $cursos)->get();
        return view('cursos.index',compact('cursos'));

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
            'preco'=>'required|numeric'
        ]);
        Cursos::create($dados);

        return redirect()->route('cursos.index')
            ->with('success', 'Curso criado com sucesso.');

    }

    /**
     * Display the specified resource.
     */
    public function show(string $id)
    {
        //
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(Cursos $cursos)
    {
        return view('cursos.edit', compact('cursos'));
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Cursos $cursos)
    {
        $dados = $request->validate([
            'titulo'=> 'required|max:100',
            'descricao'=> 'required',
            'preco'=>'required|numeric'
        ]);

        $cursos->update($dados);


        return redirect()->route('cursos.index')
            ->with('success', 'Curso Atualizado com sucesso.');

    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Cursos $cursos)
    {
        $cursos->delete($cursos);


        return redirect()->route('cursos.index')
            ->with('success', 'Curso Deletado com sucesso.');
    }

    }
