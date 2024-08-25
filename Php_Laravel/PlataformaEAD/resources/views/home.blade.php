@extends('layouts.app')

@section('content')
<section class="bg-primary text-white text-center p-5">
    <div class="container">
        <h1>Bem-vindo à Nossa Plataforma EAD</h1>
        <p>Desenvolva suas habilidades com os melhores cursos online.</p>
        <a href="#" class="btn btn-light btn-lg">Ver Cursos</a>
    </div>
</section>

<!-- Cursos Populares -->
<section class="py-5">
    <div class="container">
        <h2 class="text-center mb-4">Cursos Populares</h2>
        <div class="row">
            <div class="col-md-4">
                <div class="card">
                    <img src="https://via.placeholder.com/350x150" class="card-img-top" alt="Curso 1">
                    <div class="card-body">
                        <h5 class="card-title">Curso de Programação</h5>
                        <p class="card-text">Aprenda a programar do zero com este curso completo.</p>
                        <a href="#" class="btn btn-primary">Saiba Mais</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card">
                    <img src="https://via.placeholder.com/350x150" class="card-img-top" alt="Curso 2">
                    <div class="card-body">
                        <h5 class="card-title">Design Gráfico</h5>
                        <p class="card-text">Domine as ferramentas de design gráfico e crie projetos incríveis.</p>
                        <a href="#" class="btn btn-primary">Saiba Mais</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card">
                    <img src="https://via.placeholder.com/350x150" class="card-img-top" alt="Curso 3">
                    <div class="card-body">
                        <h5 class="card-title">Marketing Digital</h5>
                        <p class="card-text">Aprenda as melhores estratégias para crescer online.</p>
                        <a href="#" class="btn btn-primary">Saiba Mais</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<!-- Depoimentos -->
<section class="bg-light py-5">
    <div class="container">
        <h2 class="text-center mb-4">Depoimentos de Alunos</h2>
        <div class="row">
            <div class="col-md-4">
                <blockquote class="blockquote">
                    <p class="mb-0">"A melhor plataforma para aprender novas habilidades. Recomendo!"</p>
                    <footer class="blockquote-footer">João Silva</footer>
                </blockquote>
            </div>
            <div class="col-md-4">
                <blockquote class="blockquote">
                    <p class="mb-0">"Os cursos são bem estruturados e fáceis de seguir. Adorei!"</p>
                    <footer class="blockquote-footer">Maria Santos</footer>
                </blockquote>
            </div>
            <div class="col-md-4">
                <blockquote class="blockquote">
                    <p class="mb-0">"Excelente conteúdo e suporte ao aluno. Nota 10!"</p>
                    <footer class="blockquote-footer">Carlos Pereira</footer>
                </blockquote>
            </div>
        </div>
    </div>
</section>
@endsection
