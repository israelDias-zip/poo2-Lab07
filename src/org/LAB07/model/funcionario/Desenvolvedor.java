package org.LAB07.model.funcionario;

public class Desenvolvedor extends FuncionarioBase {
    private String linguagemPrincipal;
    private double bonusPorProjeto;

    public Desenvolvedor(String nome, String cpf, double salarioBase, String linguagemPrincipal, double bonusPorProjeto) {
        super(nome, cpf, salarioBase);
        this.linguagemPrincipal = linguagemPrincipal;
        this.bonusPorProjeto = bonusPorProjeto;
    }

    @Override
    public double calcularSalarioTotal() {
        return salarioBase + bonusPorProjeto;
    }
}
