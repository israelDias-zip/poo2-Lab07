package org.LAB07.model;

public class Produto {
    protected String nome;
    protected double preco;
    protected String codigoBarras;

    public Produto(String nome, double preco, String codigoBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoBarras = codigoBarras;
    }

    public void exibirDetalhes() {
        System.out.println("Produto: " + nome + " | Preço: R$ " + preco + " | Código: " + codigoBarras);
    }
}

