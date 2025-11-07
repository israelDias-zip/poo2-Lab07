package org.LAB07.main;

import org.LAB07.model.veiculo.Carro;
import org.LAB07.model.veiculo.Moto;

public class MainVeiculo {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2023, 250, 4, "Gasolina");
        Moto moto = new Moto("Honda", "CB500", 2022, 150, 500, "Elétrica");

        System.out.println("Custo locação carro (5 dias): R$ " + carro.calcularCustoLocacao(5));
        System.out.println("Custo locação moto (3 dias): R$ " + moto.calcularCustoLocacao(3));
    }
}

