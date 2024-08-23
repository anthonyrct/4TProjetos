<?php
namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Matricula extends Model
{
    use HasFactory;

    protected $fillable = ['user_id', 'curso_id'];

    public function aluno()
    {
        return $this->belongsTo(Usuario::class, 'user_id');
    }

    public function curso()
    {
        return $this->belongsTo(Cursos::class, 'curso_id');
    }
}
