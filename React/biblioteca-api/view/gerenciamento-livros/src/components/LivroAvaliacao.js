import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { useParams } from 'react-router-dom';

function LivroAvaliacao() {

    const { id } = useParams();
    const [livro, setLivro] = useState(null);
    const [nota, setNota] = useState(0);
    const [comentario, setComentario] = useState('');
    
    useEffect(() => {
        axios.get(`http://localhost:5000/livros/${id}`)
            .then(response => setLivro(response.data))
            .catch(error => console.error('Erro ao buscar o livro:', error));
    }, [id]);

    const adicionarAvaliacao = (e) => {
        e.preventDefault();

        // Envia a avaliação para o backend
        axios.post(`http://localhost:5000/livros/${id}/avaliar`, { nota, comentario })
            .then(response => {
                setLivro(response.data); // Atualiza o livro com as avaliações mais recentes
                setNota(0);
                setComentario('');
            })
            .catch(error => console.error('Erro ao adicionar avaliação:', error));
    };
    return (
        <div className="container">
            {livro ? (
                <>
                    <h1>{livro.titulo}</h1>
                    <p>Autor: {livro.autor}</p>
                    <p>Ano: {livro.ano}</p>
                    <p>Gênero: {livro.genero}</p>
                    
                    <h3>Avaliações:</h3>
                    <ul>
                        {livro.avaliacoes.map((avaliacao, index) => (
                            <li key={index}>
                                <strong>{avaliacao.usuario}</strong> - {avaliacao.nota} estrelas
                                <p>{avaliacao.comentario}</p>
                            </li>
                        ))}
                    </ul>
                    
                    <h3>Adicionar Avaliação:</h3>
                    <form onSubmit={adicionarAvaliacao}>
                        <label>
                            Nota:
                            <select value={nota} onChange={(e) => setNota(e.target.value)}>
                                <option value="0">Selecione</option>
                                <option value="1">1 estrela</option>
                                <option value="2">2 estrelas</option>
                                <option value="3">3 estrelas</option>
                                <option value="4">4 estrelas</option>
                                <option value="5">5 estrelas</option>
                            </select>
                        </label>
                        <textarea
                            value={comentario}
                            onChange={(e) => setComentario(e.target.value)}
                            placeholder="Deixe seu comentário"
                        />
                        <button type="submit">Enviar Avaliação</button>
                    </form>
                </>
            ) : (
                <p>Carregando...</p>
            )}
        </div>
    );
}

export default LivroAvaliacao;