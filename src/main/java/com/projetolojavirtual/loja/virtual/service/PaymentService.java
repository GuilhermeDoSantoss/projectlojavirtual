package com.projetolojavirtual.loja.virtual.service;


import com.projetolojavirtual.loja.virtual.entity.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public boolean processPayment(Payment payment) {
        // Simulação do processamento de pagamento
        if (payment.getMethod().equals("pix") || payment.getMethod().equals("credit_card") || payment.getMethod().equals("debit_card")) {
            return true;
        }
        return false;
    }
}