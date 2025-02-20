package Aula_05.Solid_ID.Exercicios.Exercicio_01;

import java.io.Serializable;

public class Notificacao implements ComunicacaoService {
    private ComunicacaoService comunicacaoService;

    public Notificacao(ComunicacaoService comunicacaoService) {
        this.comunicacaoService = comunicacaoService;
    }

    public void enviar(String mensagem) {
        comunicacaoService.enviar(mensagem);
    }
}
