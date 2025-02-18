package Aula_04.Solid_Liskov.Exercicios.Exercicio01.FigurasGeometricas;

public class Quadrado implements CalculaArea {
    int lado;

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public int getArea() {
        return lado * lado;
    }
}
