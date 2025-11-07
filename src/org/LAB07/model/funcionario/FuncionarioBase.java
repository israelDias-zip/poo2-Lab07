package org.LAB07.model.funcionario;

public class FuncionarioBase {
    protected String nome;
    protected String cpf;
    protected double salarioBase;

    public FuncionarioBase(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public double calcularSalarioTotal() {
        return salarioBase;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário Total: R$ " + calcularSalarioTotal());
    }
}

