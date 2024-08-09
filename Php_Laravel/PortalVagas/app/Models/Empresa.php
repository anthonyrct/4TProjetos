<?php

namespace App\Models;
	
use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Foundation\Auth\User as Authenticatable;
use Illuminate\Notifications\Notifiable;

class Empresa extends Authenticatable
{
    use Notifiable, HasFactory;

    protected $fillable = [
        'nome', 'email', 'password', 'nome_empresa', 'descricao_empresa'
    ];

    protected $hidden = [
        'password', 'remember_token',
    ];

    public function vagas()
    {
        return $this->hasMany(Vaga::class);
    }
}
