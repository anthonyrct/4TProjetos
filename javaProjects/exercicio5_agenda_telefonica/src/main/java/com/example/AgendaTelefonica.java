package com.example;

public class AgendaTelefonica {
    // atributos
    private Contato[] contatos;
    private int contador;

    public AgendaTelefonica(int maxContato) {
        contatos = new Contato[maxContato];
        contador = 0;
    }

    // metodos crud:

    // metodo adicionar:

    public void addContato(Contato contato) throws AgendaCheiaException {
        if (contador >= contatos.length) {
            throw new AgendaCheiaException("A Agenda está cheia!");
        }
        contatos[contador] = contato;
        contador++;
        System.out.println("Contato Adicionado com sucesso!");

    }

    // metodo listar:
    public void listarContato() {
        if (contador == 0) {
            System.out.println("A Agenda está Vazia");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println(contatos[i].toString());
            }
        }
        // metodo buscar:
        public Contato buscarContato(String nome) throws ContatoNaoEncontradoException {
            for (int i = 0; i < contador; i++) {
                if(contatos[i].getNome().equalsIgnoreCase(nome)){
                    return contatos[i];
                }
            }
            throw new ContatoNaoEncontradoException("Contato não encontrado!");
        // metodo remover:
            public void removerContato(String nome){
                boolean encontrado = false;
                for (int i = 0; i < contatos.length; i++) {
                    if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                        encontrado = true;
                        contatos[i] = contatos[contador -1];
                        contatos[contador -1] = null;
                        contador--;
                        System.out.println("Contato removido com sucesso");
                    }
                }
                if (!encontrado) {
                    throw new ContatoNaoEncontrado("Contato não encontrado");
                }
            }
    }
}
}
