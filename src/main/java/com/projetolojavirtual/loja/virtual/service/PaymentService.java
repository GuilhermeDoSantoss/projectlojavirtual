package com.projetolojavirtual.loja.virtual.service;


import com.projetolojavirtual.loja.virtual.entity.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public String processarPagamentoPix(PagamentoRequest pagamentoRequest) {
        // Lógica para processar pagamento via PIX
        return "Pagamento via PIX processado com sucesso!";
    }

    public String processarPagamentoCartaoCredito(PagamentoRequest pagamentoRequest) {
        // Lógica para processar pagamento via cartão de crédito
        return "Pagamento via Cartão de Crédito processado com sucesso!";
    }

    public String processarPagamentoCartaoDebito(PagamentoRequest pagamentoRequest) {
        // Lógica para processar pagamento via cartão de débito
        return "Pagamento via Cartão de Débito processado com sucesso!";
    }
}