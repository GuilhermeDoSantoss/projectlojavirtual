package com.projetolojavirtual.loja.virtual.controller.request;

public class ReembolsoRequest {

    private String idTransacao;
    private double valor;

    public String getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(String idTransacao) {
        this.idTransacao = idTransacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
