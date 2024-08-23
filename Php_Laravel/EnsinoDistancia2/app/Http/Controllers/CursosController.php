<?php

namespace App\Http\Controllers;


use App\Models\Cursos;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Auth;

class CursosController extends Controller{
// Exibir todos os cursos
public function index()
{
    $cursos = Cursos::all();
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

    if (Auth::check()) {
    Cursos::create([
        'titulo' => $request->titulo,
        'descricao' => $request->descricao,
        'user_id' => auth::id(), // O professor logado cria o curso

    ]);
    return redirect()->route('cursos.index')->with('success', 'Curso criado com sucesso!');
    }   else{
        return redirect()->route('login')->with('error', 'Você precisa estar autenticado para criar um curso.');
    }

}



// Exibir um curso específico
public function show(Cursos $curso)
{
    return view('cursos.show', compact('curso'));
}

// Exibir formulário para editar um curso
public function edit (Cursos $curso)
{
    return view('cursos.edit', compact('curso'));


}

// Atualizar um curso existente
public function update(Request $request, Cursos $curso)
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
public function destroy(Cursos $curso)
{
    $curso->delete();
    return redirect()->route('cursos.index')->with('success', 'Curso excluído com sucesso!');


    // $this->authorize('delete', $curso);
    // $curso->delete();
    // return redirect()->route('cursos.index')->with('success', 'Curso excluído com sucesso!');
}

}

