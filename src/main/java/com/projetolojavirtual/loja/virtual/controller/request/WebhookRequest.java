package com.projetolojavirtual.loja.virtual.controller.request;

public class WebhookRequest {

    private String evento;
    private String dados;

    // Getters e Setters

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }
}
