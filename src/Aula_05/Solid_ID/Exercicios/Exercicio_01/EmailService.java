package Aula_05.Solid_ID.Exercicios.Exercicio_01;

public class EmailService implements ComunicacaoService{

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
    }
}
