<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Foundation\Auth\User as Authenticatable;
use Illuminate\Notifications\Notifiable;

class Usuario extends Authenticatable
{
    use HasFactory, Notifiable;

    protected $fillable = [
        'nome',
        'email',
        'password',
        'tipo',
        'nome_professor'
    ];
    protected $hidden = [
        'password',
        'remember_token',
    ];
    public function inscricoes()
    {
        return $this->hasMany(Inscricao::class);
    }


    public function isAluno()
    {
        return $this->tipo === 'aluno';
    }

    public function isProfessor()
    {
        return $this->tipo === 'professor';
    }
}
