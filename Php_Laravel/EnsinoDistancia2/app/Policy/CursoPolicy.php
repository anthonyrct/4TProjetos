<?php
namespace App\Policies;

use App\Models\Curso;
use App\Models\Usuario;
use Illuminate\Auth\Access\HandlesAuthorization;

class CursoPolicy
{
    use HandlesAuthorization;

    // Verificar se o usuário pode atualizar o curso
    public function update(Usuario $user, Curso $curso)
    {
        return $user->id === $curso->user_id; // Apenas o professor que criou o curso pode atualizá-lo
    }

    // Verificar se o usuário pode deletar o curso
    public function delete(Usuario $user, Curso $curso)
    {
        return $user->id === $curso->user_id; // Apenas o professor que criou o curso pode deletá-lo
    }
}
