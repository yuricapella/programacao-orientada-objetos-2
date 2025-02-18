package Aula_04.Solid_Liskov.Exercicios.Exercicio01;

import Aula_04.Solid_Liskov.Exercicios.Exercicio01.FigurasGeometricas.Quadrado;
import Aula_04.Solid_Liskov.Exercicios.Exercicio01.FigurasGeometricas.Retangulo;

public class Main {
    public static void main(String[] args) {
        Quadrado r = new Quadrado();
        r.setLado(5);
        System.out.println("Área do quadrado: " + r.getArea());

        Retangulo r2 = new Retangulo();
        r2.setLargura(5);
        r2.setAltura(10);
        System.out.println("Área do triangulo: " + r2.getArea());

    }
}
