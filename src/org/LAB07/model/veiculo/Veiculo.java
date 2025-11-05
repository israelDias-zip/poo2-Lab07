package org.LAB07.model;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double precoDiaria;

    public Veiculo(String marca, String modelo, int ano, double precoDiaria) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.precoDiaria = precoDiaria;
    }

    public double calcularCustoLocacao(int dias) {
        return dias * precoDiaria;
    }
}
