<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Notifications\Notifiable;
use Illuminate\Foundation\Auth\User as Authenticatable;

class Professor extends Authenticatable
{
    use HasFactory;
    protected $fillable = [
        'nome', 'email', 'password','nomeProfessor', 'descricaoProfessor'
    ];
    protected $hidden = [
        'password', 'remember_token',
    ];

    public function curso()
    {
        return $this->hasMany(Cursos::class);
    }
}
