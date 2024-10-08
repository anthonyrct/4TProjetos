<header>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Minha Marca</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="/">Início</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Contato</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="{{ route('ajuda.index') }}">Ajuda</a>
                    </li>
                    @if (Auth::check())
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Olá, {{ Auth::user()->nome }}
                        </a>
                        <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="userDropdown">
                            @if (Auth::user()->isProfessor())
                                <li><a class="dropdown-item" href="/cursos">Página Interna do Docente</a></li>
                            @endif
                            <li>
                                <form action="/logout" method="POST">
                                    @csrf
                                    <button type="submit" class="dropdown-item">Sair</button>
                                </form>
                            </li>
                        </ul>
                    </li>
                @else
                    <li class="nav-item">
                        <a class="nav-link btn btn-outline-primary" href="{{ url('/login') }}">Login</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link btn btn-primary" href="{{ url('/registro') }}">Registre-se</a>
                    </li>
                @endif
                </ul>
            </div>
        </div>
    </nav>
</header>

<style>
    /* Efeito de hover para os links de navegação */
    .navbar-nav .nav-link {
        color: #060809
        transition: color 0.3s, text-decoration 0.3s;
    }

    .navbar-nav .nav-link:hover {

        text-decoration: underline; /* Sublinha o texto */
        background-color: #8fc5ff;
    }
</style>
