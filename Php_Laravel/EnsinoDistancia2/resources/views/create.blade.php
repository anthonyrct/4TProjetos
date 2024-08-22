@extends('layouts.app')

@section('content')
    <h1>Criar Novo Curso</h1>
    <form action="{{ route('cursos.store') }}" method="POST">
        @csrf
        <label for="titulo">Título:</label>
        <input type="text" name="titulo" id="titulo" required>

        <label for="descricao">Descrição:</label>
        <textarea name="descricao" id="descricao" required></textarea>

        <button type="submit">Criar Curso</button>
    </form>
@endsection
