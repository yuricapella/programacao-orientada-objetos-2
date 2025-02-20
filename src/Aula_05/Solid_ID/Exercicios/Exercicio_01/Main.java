package Aula_05.Solid_ID.Exercicios.Exercicio_01;

public class Main {
    public static void main(String[] args) {
        ComunicacaoService comunicacaoService = new EmailService();
        Notificacao notificacao = new Notificacao(comunicacaoService);

        notificacao.enviar("Notificação enviada!!");

    }
}
