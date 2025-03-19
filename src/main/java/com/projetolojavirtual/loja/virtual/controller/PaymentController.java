package com.projetolojavirtual.loja.virtual.controller;


import com.projetolojavirtual.loja.virtual.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pagamentos")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/pix")
    public String pagarComPix(@RequestBody PagamentoRequest pagamentoRequest) {
        return paymentService.processarPagamentoPix(pagamentoRequest);
    }

    @PostMapping("/cartao-credito")
    public String pagarComCartaoCredito(@RequestBody PagamentoRequest pagamentoRequest) {
        return paymentService.processarPagamentoCartaoCredito(pagamentoRequest);
    }

    @PostMapping("/cartao-debito")
    public String pagarComCartaoDebito(@RequestBody PagamentoRequest pagamentoRequest) {
        return paymentService.processarPagamentoCartaoDebito(pagamentoRequest);
    }
}