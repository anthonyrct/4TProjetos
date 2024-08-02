<?php

namespace App\Http\Controllers;

use App\Models\produto;
use Illuminate\Http\Request;

class ProdutoController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        $produtos = produto::all();
        return view('produtos.view', compact('produtos'));
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        return view('produtos.create');
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        $request->validate([
            'nome' => 'required',
            'descricao' => 'required',
            'preco' => 'required|decimal',
            'quantidade' => 'required|interger',
        ]);

        produto::create($request->all());
        return redirect()->route('produtos.index')->
        with('success', 'Produto criado com sucesso.');
    }
    /**
     * Display the specified resource.
     */
    public function show(produto $produto)
    {
        return view('produtos.show', compact('produto'));
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(produto $produto)
    {
        return view('produtos.edit', compact('produto'));
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, produto $produto)
    {
        $request->validate([
            'nome'=>'required',
            'descricao'=>'required',
            'preco'=>'required|numeric',
            'quantidade'=> 'required|interger'
        ]);

        $produto->update($request->all());
        return redirect()->route('produtos.index')->with('sucess', 'Produto atualizado com sucesso');
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(produto $produto)
    {
        $produto->delete();

        return redirect()->route('produtos.index')->with('success','produto excluido com sucesso');
    }
    // <div class="container">
    //     <h1>Produtos</h1>
    //     <a href="" class="btn btn-primary">Adicionar Produto</a>
    //     <table class="table table-bordered mt-4">
    //         <thead>
    //             <tr>
    //                 <th>ID</th>
    //                 <th>Nome</th>
    //                 <th>Descrição</th>
    //                 <th>Preço</th>
    //                 <th>Quantidade</th>
    //                 <th>Ações</th>
    //             </tr>
    //         </thead>
    //         <tbody>
    //             @foreach ($produtos as $produto)
    //                 <tr>
    //                     <td>{{ $produto->id }}</td>
    //                     <td>{{ $produto->nome }}</td>
    //                     <td>{{ $produto->descricao }}</td>
    //                     <td>{{ $produto->preco }}</td>
    //                     <td>{{ $produto->quantidade }}</td>
    //                     <td>
    //                         <a href="{{ route('produtos.show', $produto->id) }}" class="btn btn-info">Ver</a>
    //                         <a href="{{ route('produtos.edit', $produto->id) }}" class="btn btn-warning">Editar</a>
    //                         <form action="{{ route('produtos.destroy', $produto->id) }}" method="POST" style="display:inline;">
    //                             @csrf
    //                             @method('DELETE')
    //                             <button type="submit" class="btn btn-danger">Excluir</button>
    //                         </form>
    //                     </td>
    //                 </tr>
    //             @endforeach
    //         </tbody>
    //     </table>
    // </div>
}
