package org.LAB07.main;

import org.LAB07.model.funcionario.Desenvolvedor;
import org.LAB07.model.funcionario.FuncionarioBase;
import org.LAB07.model.funcionario.Gerente;

public class MainFuncionario {
    public static void main(String[] args) {
        FuncionarioBase f1 = new FuncionarioBase("João", "111.111.111-11", 3000);
        Gerente g1 = new Gerente("Maria", "222.222.222-22", 5000, "TI", 20);
        Desenvolvedor d1 = new Desenvolvedor("Carlos", "333.333.333-33", 4000, "Java", 800);

        f1.exibirDados();
        g1.exibirDados();
        d1.exibirDados();
    }
}
