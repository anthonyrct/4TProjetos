<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>@yield('title', 'Plataforma EAD')</title>
    <link rel="stylesheet" href="{{ asset('css/app.css') }}"> <!-- Link para os estilos, se houver -->
</head>
<body>
    <header>
        <nav>
            <ul>
                <li><a href="{{ url('/') }}">Home</a></li>
                <li><a href="{{ url('/ajuda') }}">Ajuda</a></li>

                @if(auth()->check() && auth()->user()->role == 'aluno')
                    <li><a href="{{ route('dashboard.aluno') }}">Meus Cursos</a></li>
                @elseif(auth()->check() && auth()->user()->role == 'professor')
                    <li><a href="{{ route('dashboard.professor') }}">Meus Cursos</a></li>
                @endif

                @if(auth()->check())
                    <li><a href="{{ route('logout') }}">Logout</a></li>
                @else
                    <li><a href="{{ route('login') }}">Login</a></li>
                    <li><a href="{{ route('register') }}">Registrar</a></li>
                @endif
            </ul>
        </nav>
    </header>

    <main>
        @yield('content') <!-- Área para o conteúdo das views específicas -->
    </main>

    <footer>
        <p>&copy; {{ date('Y') }} Plataforma EAD</p>
    </footer>
</body>
</html>
