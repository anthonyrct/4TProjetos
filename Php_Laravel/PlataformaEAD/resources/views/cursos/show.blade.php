@extends('layouts.app')


@section('content')
    <div class="container">
        <div class="row">
            <div class="col-md-6">
                <img src="/assets/img/img1.png" class="img-fluid" alt="{{ $curso->titulo }}">
            </div>
            <div class="col-md-6">
                <h2>{{ $curso->titulo }}</h2>
                <p>{{ $curso->descricao }}</p>
                <p>Preço: R$ {{ $curso->preco }}</p>

                @if (session('success'))
                <div class="alert alert-success">
                    {{ session('success') }}
                </div>
            @endif

            @if (session('warning'))
                <div class="alert alert-warning">
                    {{ session('warning') }}
                </div>
            @endif

                <form method="POST" action="{{ route('matricula.add', $curso->id) }}">
                    @csrf
                    <button type="submit" class="btn btn-primary">Fazer Matricula</button>
                </form>
            </div>
        </div>
    </div>
@endsection

