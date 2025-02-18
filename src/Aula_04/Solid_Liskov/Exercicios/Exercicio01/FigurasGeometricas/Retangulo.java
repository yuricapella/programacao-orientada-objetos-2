package Aula_04.Solid_Liskov.Exercicios.Exercicio01.FigurasGeometricas;

public class Retangulo implements CalculaArea {
    int altura;
    int largura;

    public void setLargura(int largura) {
        this.largura = largura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int getArea() {
        return largura*altura;
    }
}
