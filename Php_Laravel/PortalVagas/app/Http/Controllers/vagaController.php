<?php

namespace App\Http\Controllers;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use App\Models\Vaga;

class vagaController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        $vagas = Vaga::all();
        return view('vaga.index', compact('vagas'));
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        return view('vaga.create');
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        $dados = $request->validate([
            'titulo'=>'required|max:100',
            'descricao'=>'required',
            'localizacao'=>'required',
            'salario'=>'required|numeric',
            'empresa'=>'required'
        ]);
        Vaga::create($dados);

        return redirect()->route('vagas.index')->with('success','Vaga criada com sucesso.');
    }

    /**
     * Display the specified resource.
     */

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(Vaga $vaga)
    {
        return view('vagas.edit', compact('vaga'));
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, Vaga $vaga)
    {
        $dados = $request->validate([
            'titulo'=>'required|max:100',
            'descricao'=>'required',
            'localizacao'=>'required',
            'salario'=>'required|numeric',
            'empresa'=>'required'
        ]);
        $vaga->update($dados);

        return redirect()->route('vagas.index')->with('success','Vaga atualizada com sucesso.');
    }


    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Vaga $vaga)
    {
        $vaga->delete($vaga);

        return redirect()->route('vagas.index')->with('success','Vaga deletada com sucesso.');
    }
}
