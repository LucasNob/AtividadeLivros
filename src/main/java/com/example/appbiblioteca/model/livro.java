package com.example.appbiblioteca.model;

public class livro {
    
    private int id;
    private String nome;
    private String editora;
    private int lancamento;
    private int estoque;

    public livro(int id, String nome, String editora, int lancamento, int estoque) {
        this.id = id;
        this.nome = nome;
        this.editora = editora;
        this.lancamento = lancamento;
        this.estoque = estoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getLancamento() {
        return lancamento;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "livro [editora=" + editora + ", estoque=" + estoque + ", id=" + id + ", lancamento=" + lancamento
                + ", nome=" + nome + "]";
    }

}