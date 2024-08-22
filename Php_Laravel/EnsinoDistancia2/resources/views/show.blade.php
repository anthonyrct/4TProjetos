@extends('layouts.app')

@section('content')
    <h1>{{ $curso->titulo }}</h1>
    <p>{{ $curso->descricao }}</p>
    <a href="{{ route('cursos.edit', $curso->id) }}">Editar Curso</a>
@endsection

{{-- botão para se matricular no curso--}}
@if(auth()->check() && auth()->user()->role == 'aluno')
    <form action="{{ route('cursos.matricular', $curso->id) }}" method="POST">
        @csrf
        <button type="submit">Matricular-se neste curso</button>
    </form>
@endif
