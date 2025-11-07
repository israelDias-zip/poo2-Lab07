package org.LAB07.main;

import org.LAB07.model.produto.Eletronico;
import org.LAB07.model.produto.Livro;
import org.LAB07.model.produto.Roupa;

public class MainProduto {
    public static void main(String[] args) {
        Eletronico e = new Eletronico("Notebook", 3500, "123456", "Dell", "Bivolt");
        Livro l = new Livro("Clean Code", 150, "7891011", "Robert C. Martin", "9780132350884");
        Roupa r = new Roupa("Camiseta", 80, "222333", "M", "Algodão");

        e.exibirDetalhes();
        l.exibirDetalhes();
        r.exibirDetalhes();
    }
}
