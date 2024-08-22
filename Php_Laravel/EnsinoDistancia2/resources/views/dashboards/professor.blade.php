@extends('layouts.app')

@section('title', 'Meus Cursos Criados')

@section('content')
    <h1>Meus Cursos Criados</h1>

    <a href="{{ route('cursos.create') }}" class="btn btn-primary">Criar Novo Curso</a>

    @if($cursos->isEmpty())
        <p>Você ainda não criou nenhum curso.</p>
    @else
        <ul>
            @foreach($cursos as $curso)
                <li>
                    <a href="{{ route('cursos.show', $curso->id) }}">{{ $curso->titulo }}</a>
                    <a href="{{ route('cursos.edit', $curso->id) }}">Editar</a>
                </li>
            @endforeach
        </ul>
    @endif
@endsection
