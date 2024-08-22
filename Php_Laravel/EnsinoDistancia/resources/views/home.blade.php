@extends('layouts.app')




@section('content')
    <div class="container">
        <div id="productCarousel" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-inner">
                @foreach ($cursos as $index => $curso)
                    <div class="carousel-item {{ $index == 0 ? 'active' : '' }}">
                        <img src="\assets\img\img{{$index+1}}.png" class="d-block w-100" alt="{{ $curso->titulo }}">
                        <div class="carousel-caption d-none d-md-block">
                            <h5>{{ $curso->titulo }}</h5>
                                    <p>{{ $curso->descricao }}</p>
                                    <p>Salário: R$ {{ $curso->preco }}</p>
                        </div>
                    </div>
                @endforeach
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#productCarousel" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#productCarousel" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>
    </div>
@endsection
