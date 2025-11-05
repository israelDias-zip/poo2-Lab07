package org.LAB07.model;

public class Gerente extends FuncionarioBase {
    private String departamento;
    private double bonificacaoPercentual;

    public Gerente(String nome, String cpf, double salarioBase, String departamento, double bonificacaoPercentual) {
        super(nome, cpf, salarioBase);
        this.departamento = departamento;
        this.bonificacaoPercentual = bonificacaoPercentual;
    }

    @Override
    public double calcularSalarioTotal() {
        return salarioBase + (salarioBase * bonificacaoPercentual / 100);
    }
}

