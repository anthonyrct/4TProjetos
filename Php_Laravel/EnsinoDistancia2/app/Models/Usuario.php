<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Usuario extends Model
{
    use HasFactory;

    protected $fillable = [
        'nome', 'email', 'password', 'role'
    ];

    protected $hidden = [
        'password', 'remember_token',
    ];


    // Relacionamentos
    public function cursos()
    {
        return $this->hasMany(Cursos::class, 'user_id');
    }

    public function matriculas()
    {
        return $this->hasMany(Matricula::class, 'user_id');
    }
}
