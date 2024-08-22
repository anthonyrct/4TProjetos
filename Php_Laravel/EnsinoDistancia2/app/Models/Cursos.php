<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Cursos extends Model
{
    use HasFactory;
    protected $fillable = ['titulo', 'descricao', 'user_id'];

    // Um curso pertence a um usuário (professor)
    public function professor()
    {
        return $this->belongsTo(Usuario::class, 'user_id');
    }

    public function alunos()
{
    return $this->belongsToMany(Usuario::class, 'matriculas');
}
}
