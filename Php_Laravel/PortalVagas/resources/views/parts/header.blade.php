

@if (Auth::check())
<div>
    <h3>Olá, {{Auth::user()->nome}}</h3>
</div>
<div>
    <form action="/logout" method="post">
    @csrf
    <input type='submit' value='Sair'>
    </form>
</div>
<br>
<hr>
<br>
@else
<div class="nav-bar">
    <a href="/login">Login</a>
    <a href="/registro">Registre-se</a>
</div>
<br>
<hr>
<br>
@endif
