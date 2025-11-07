package org.LAB07.main;

import org.LAB07.model.figuras.Circulo;
import org.LAB07.model.figuras.Retangulo;
import org.LAB07.model.figuras.Triangulo;

public class MainFigura {
    public static void main(String[] args) {
        Circulo c = new Circulo(5);
        Retangulo r = new Retangulo(4, 6);
        Triangulo t = new Triangulo(3, 4, 3, 4, 5);

        System.out.println("Círculo -> Área: " + c.calcularArea() + " | Perímetro: " + c.calcularPerimetro());
        System.out.println("Retângulo -> Área: " + r.calcularArea() + " | Perímetro: " + r.calcularPerimetro());
        System.out.println("Triângulo -> Área: " + t.calcularArea() + " | Perímetro: " + t.calcularPerimetro());
    }
}

