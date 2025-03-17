package com.projetolojavirtual.loja.virtual.controller;

import com.loja.virtual.model.Payment;
import com.loja.virtual.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/pay")
    public String processPayment(Payment payment, Model model) {
        boolean success = paymentService.processPayment(payment);
        if (success) {
            model.addAttribute("message", "Pagamento realizado com sucesso!");
        } else {
            model.addAttribute("message", "Falha no pagamento.");
        }
        return "paymentResult";
    }
}