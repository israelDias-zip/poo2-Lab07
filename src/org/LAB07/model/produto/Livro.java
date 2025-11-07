package org.LAB07.model.produto;

public class Livro extends Produto {
    private String autor;
    private String isbn;

    public Livro(String nome, double preco, String codigoBarras, String autor, String isbn) {
        super(nome, preco, codigoBarras);
        this.autor = autor;
        this.isbn = isbn;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Autor: " + autor + " | ISBN: " + isbn);
    }
}

