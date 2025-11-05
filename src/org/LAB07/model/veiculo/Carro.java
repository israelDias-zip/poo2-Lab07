package org.LAB07.model;

public class Carro extends Veiculo {
    private int numeroPortas;
    private String tipoCombustivel;

    public Carro(String marca, String modelo, int ano, double precoDiaria, int numeroPortas, String tipoCombustivel) {
        super(marca, modelo, ano, precoDiaria);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }
}

