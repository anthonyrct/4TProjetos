<?php

namespace App\Http\Controllers;

use App\Models\Curso;
use Illuminate\Http\Request;

class CursosController extends Controller{
// Exibir todos os cursos
public function index()
{
    $cursos = Curso::all();
    return view('cursos.index', compact('cursos'));
}

// Exibir formulário para criar um novo curso
public function create()
{
    return view('cursos.create');
}

// Armazenar um novo curso no banco de dados
public function store(Request $request)
{
    $request->validate([
        'titulo' => 'required|string|max:255',
        'descricao' => 'required|string',
    ]);

    Curso::create([
        'titulo' => $request->titulo,
        'descricao' => $request->descricao,
        'user_id' => auth()->id(), // O professor logado cria o curso
    ]);

    return redirect()->route('cursos.index')->with('success', 'Curso criado com sucesso!');
}

// Exibir um curso específico
public function show(Curso $curso)
{
    return view('cursos.show', compact('curso'));
}

// Exibir formulário para editar um curso
public function edit(Curso $curso)
{
    return view('cursos.edit', compact('curso'));
}

// Atualizar um curso existente
public function update(Request $request, Curso $curso)
{
    $request->validate([
        'titulo' => 'required|string|max:255',
        'descricao' => 'required|string',
    ]);

    $curso->update([
        'titulo' => $request->titulo,
        'descricao' => $request->descricao,
    ]);

    return redirect()->route('cursos.index')->with('success', 'Curso atualizado com sucesso!');
}

// Excluir um curso
public function destroy(Curso $curso)
{
    $curso->delete();
    return redirect()->route('cursos.index')->with('success', 'Curso excluído com sucesso!');
}
//funçoes para adicionar uma politica de qual usuario pode editar e excluir cursos, no caso o professor(em progesso)
public function edit(Curso $curso)
{
    $this->authorize('update', $curso);
    return view('cursos.edit', compact('curso'));
}


public function destroy(Curso $curso)
{
    $this->authorize('delete', $curso);
    $curso->delete();
    return redirect()->route('cursos.index')->with('success', 'Curso excluído com sucesso!');
}

}

