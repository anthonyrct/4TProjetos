<?php
namespace App\Http;

use Illuminate\Foundation\Http\Kernel as HttpKernel;

class Kernel extends HttpKernel
{
    /**
     * The application's route middleware groups.
     *
     * @var array
     */
        protected $routeMiddleware = [

            'role' => \App\Http\Middleware\VerificaRole::class,
        ];
    

}