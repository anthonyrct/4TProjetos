<?php
	namespace App\Models;

    use Illuminate\Database\Eloquent\Factories\HasFactory;
    use Illuminate\Foundation\Auth\User as Authenticatable;
    use Illuminate\Notifications\Notifiable;


    class Usuario extends Authenticatable
    {
        use Notifiable, HasFactory;
        protected $fillable = [
            'nome', 'email', 'password','tipo','cpf','area'
        ];
        protected $hidden = [
            'password', 'remember_token',
        ];

        public function inscricoes() {
            return $this->hasMany(Matricula::class);
        }

        // Método para verificar se o usuário é um aluno
        public function isAluno() {
            return $this->tipo === 'aluno';
        }

        // Método para verificar se o usuário é um docente (professor)
        public function isProfessor() {
            return $this->tipo === 'professor';
        }



    }

