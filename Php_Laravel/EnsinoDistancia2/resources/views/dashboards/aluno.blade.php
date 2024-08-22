@extends('layouts.app')


@section('title', 'Meus Cursos Matriculados')

@section('content')
    <h1>Meus Cursos Matriculados</h1>

    @if($cursos->isEmpty())
        <p>Você não está matriculado em nenhum curso.</p>
    @else
        <ul>
            @foreach($cursos as $curso)
                <li>
                    <a href="{{ route('cursos.show', $curso->id) }}">{{ $curso->titulo }}</a>
                </li>
            @endforeach
        </ul>
    @endif
@endsection
