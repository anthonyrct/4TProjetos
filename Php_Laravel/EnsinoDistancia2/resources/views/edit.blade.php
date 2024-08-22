@extends('layouts.app')

@section('content')
    <h1>Editar Curso</h1>
    <form action="{{ route('cursos.update', $curso->id) }}" method="POST">
        @csrf
        @method('PUT')
        <label for="titulo">Título:</label>
        <input type="text" name="titulo" id="titulo" value="{{ $curso->titulo }}" required>

        <label for="descricao">Descrição:</label>
        <textarea name="descricao" id="descricao" required>{{ $curso->descricao }}</textarea>

        <button type="submit">Atualizar Curso</button>
    </form>
@endsection
