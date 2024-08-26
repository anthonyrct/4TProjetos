@extends('layouts.app')

@section('content')
<div class="container">
    <h1>Manual do Usuário</h1>

    <h2>1. Cadastro e Login</h2>
    <p>Para se cadastrar, clique no link "Registrar" na página inicial. Preencha os dados necessários, como nome, e-mail, senha, tipo de usuário (aluno ou professor), CPF (opcional) e área de atuação (opcional). Após o cadastro, você pode fazer login usando o e-mail e a senha cadastrados.</p>

    <h2>2. Navegação no Dashboard</h2>
    <p>Após o login, você será direcionado ao seu painel de controle (dashboard). No dashboard, você pode:</p>
    <ul>
        <li><strong>Alunos:</strong> Visualizar cursos disponíveis, se inscrever em cursos e gerenciar suas inscrições.</li>
        <li><strong>Professores:</strong> Criar, editar e excluir cursos. Também é possível visualizar suas próprias inscrições.</li>
    </ul>

    <h2>3. Gerenciamento de Cursos</h2>
    <p>Para os professores:</p>
    <ul>
        <li><strong>Criar um Curso:</strong> Clique no botão "Criar Novo Curso" e preencha os campos obrigatórios, como título, descrição, categoria e preço. O nome do professor será automaticamente atribuído ao curso.</li>
        <li><strong>Editar um Curso:</strong> Vá para a lista de cursos, encontre o curso que deseja editar e clique no botão "Editar". Atualize as informações conforme necessário e salve as alterações.</li>
        <li><strong>Excluir um Curso:</strong> Na lista de cursos, encontre o curso que deseja excluir e clique no botão "Deletar". Confirme a exclusão na caixa de diálogo que aparecerá.</li>
    </ul>

    <h2>4. Inscrição em Cursos</h2>
    <p>Como aluno:</p>
    <ul>
        <li>Visualize a lista de cursos disponíveis na página "Cursos".</li>
        <li>Clique no curso desejado para ver mais detalhes e inscreva-se clicando no botão "Inscrever-se".</li>
        <li>Após a inscrição, o status será definido como "pendente" até a confirmação pelo professor, se necessário.</li>
    </ul>

    <h2>5. Edição de Perfil</h2>
    <p>Para editar seu perfil:</p>
    <ul>
        <li>Acesse a seção "Perfil" no dashboard.</li>
        <li>Atualize suas informações pessoais conforme necessário, como nome, e-mail, e outros detalhes relevantes.</li>
    </ul>

    <h2>6. Contato e Suporte</h2>
    <p>Se precisar de ajuda adicional, você pode entrar em contato com o suporte técnico através da seção de contato na página inicial ou enviar um e-mail para nossa equipe de suporte.</p>
</div>
@endsection
