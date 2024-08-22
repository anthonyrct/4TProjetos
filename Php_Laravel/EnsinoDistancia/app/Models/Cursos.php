<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Cursos extends Model
{
    use HasFactory;
    protected $fillable = [
        'titulo', 'descricao', 'preco'
    ];


    // public function empresa()
    // {
    //     return $this->belongsTo(Empresa::class);
    // }


    public function inscricoes()
    {
        return $this->hasMany(Inscricao::class);
    }

}
