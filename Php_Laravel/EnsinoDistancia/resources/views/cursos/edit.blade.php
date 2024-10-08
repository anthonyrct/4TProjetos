
    @extends('layouts.app')




@section('content')
<div class="container">
    <h1 class="my-4">Criar Curso</h1>


    @if ($errors->any())
        <div class="alert alert-danger">
            <strong>Oops!</strong> Houve alguns problemas com sua entrada.<br><br>
            <ul>
                @foreach ($errors->all() as $error)
                    <li>{{ $error }}</li>
                @endforeach
            </ul>
        </div>
    @endif


    <form action="{{ route('cursos.update', $curso->id) }}" method="POST">
         @csrf
	   @method('PUT')
        <div class="form-group">
            <label for="nome">Título:</label>
            <input type="text" name="titulo" class="form-control" value="{{$curso->titulo}}">
        </div>


        <div class="form-group">
            <label for="descricao">Descrição:</label>
            <input type="text" name="descricao" class="form-control" value="{{$curso->descricao}}">
        </div>


        <div class="form-group">
            <label for="preco">Preco:</label>
            <input type="text" name="preco" class="form-control" value="{{$curso->preco}}">
        </div>



        <button type="submit" class="btn btn-primary">Enviar</button>
    </form>
</div>
@endsection

