<?php

namespace App\Models;


use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;


class Matricula extends Model
{
    use HasFactory;


    protected $fillable = [
        'aluno_id', 'curso_id', 'status',
    ];

    public function aluno()
    {
        return $this->belongsTo(Usuario::class, 'aluno_id');
    }

    public function curso()
    {
        return $this->belongsTo(Curso::class, 'curso_id');
    }

}

