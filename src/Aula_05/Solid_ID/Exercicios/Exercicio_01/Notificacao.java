package Aula_05.Solid_ID.Exercicios.Exercicio_01;

public class Notificacao {
    private ComunicacaoService comunicacaoService;

    public Notificacao(ComunicacaoService comunicacaoService) {
        this.comunicacaoService = comunicacaoService;
    }

    public void enviarNotificacao(String mensagem) {
        comunicacaoService.enviar(mensagem);
    }
}
