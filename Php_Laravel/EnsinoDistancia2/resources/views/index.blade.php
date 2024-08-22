@extends('layouts.app')

@section('content')
    <h1>Todos os Cursos</h1>
    <a href="{{ route('cursos.create') }}">Criar Novo Curso</a>
    <ul>
        @foreach($cursos as $curso)
            <li>
                <a href="{{ route('cursos.show', $curso->id) }}">{{ $curso->titulo }}</a>
                <a href="{{ route('cursos.edit', $curso->id) }}">Editar</a>
                <form action="{{ route('cursos.destroy', $curso->id) }}" method="POST" style="display:inline;">
                    @csrf
                    @method('DELETE')
                    <button type="submit">Excluir</button>
                </form>
            </li>
        @endforeach
    </ul>
@endsection
