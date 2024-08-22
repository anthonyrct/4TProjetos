<?php
use App\Models\Curso;
use App\Policies\CursoPolicy;

protected $policies = [
    Curso::class => CursoPolicy::class,
];
