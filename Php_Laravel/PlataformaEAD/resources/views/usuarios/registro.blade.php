@extends('layouts.app')


@section('content')
{{-- formulario --}}
<div class="container">
    <h1>Registrar-se</h1>
    <form method="POST" action="{{ route('usuarios.registro') }}">
        @csrf


        <div class="form-group">
            <label for="name">Nome</label>
            <input type="text" name="nome" class="form-control" required>
        </div>


        <div class="form-group">
            <label for="email">Email</label>
            <input type="email" name="email" class="form-control" required>
        </div>

        <div class="mb-3">
            <label for="tipo" class="form-label">Tipo de Usuário</label>
            <select class="form-select" id="tipo" name="tipo" required>
                <option value="aluno">Aluno</option>
                <option value="professor">Professor</option>
            </select>
        </div>

        <div class="form-group">
            <label for="cpf">Cpf</label>
            <input type="text" name="cpf" class="form-control" required>
        </div>

        <div class="form-group">
            <label for="area">Area</label>
            <input type="text" name="area" class="form-control" required>
        </div>


        <div class="form-group">
            <label for="password">Senha</label>
            <input type="password" name="password" class="form-control" required>
        </div>


        <div class="form-group">
            <label for="password_confirmation">Confirme a Senha</label>
            <input type="password" name="password_confirmation" class="form-control" required>
        </div>




        <button type="submit" class="btn btn-primary">Registrar-se</button>
    </form>
</div>


@endsection

