<?php
namespace App\Http\Middleware;

use Closure;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Auth;

class VerificaRole
{
    public function handle(Request $request, Closure $next, $role)
    {
        // Verifica se o usuário está autenticado e se seu papel corresponde ao esperado
        if (!auth::check() || auth::user()->role !== $role) {
            return redirect('/')->with('error', 'Você não tem permissão para acessar esta página.');
        }

        return $next($request);
    }
}
