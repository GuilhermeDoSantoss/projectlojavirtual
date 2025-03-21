package com.projetolojavirtual.loja.virtual.controller;


import com.projetolojavirtual.loja.virtual.controller.request.ClienteRequest;
import com.projetolojavirtual.loja.virtual.controller.request.PaymentRequest;
import com.projetolojavirtual.loja.virtual.controller.request.ReembolsoRequest;
import com.projetolojavirtual.loja.virtual.controller.request.WebhookRequest;
import com.projetolojavirtual.loja.virtual.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pagamentos")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/pix")
    public String pagarComPix(@RequestBody PaymentRequest pagamentoRequest) {
        return paymentService.processarPagamentoPix(pagamentoRequest);
    }

    @PostMapping("/cartao-credito")
    public String pagarComCartaoCredito(@RequestBody PaymentRequest pagamentoRequest) {
        return paymentService.processarPagamentoCartaoCredito(pagamentoRequest);
    }

    @PostMapping("/cartao-debito")
    public String pagarComCartaoDebito(@RequestBody PaymentRequest pagamentoRequest) {
        return paymentService.processarPagamentoCartaoDebito(pagamentoRequest);
    }

    @GetMapping("/status/{id}")
    public String consultarStatusPagamento(@PathVariable("id") String id) {
        return paymentService.consultarStatusPagamento(id);
    }

    @PostMapping("/clientes")
    public String criarCliente(@RequestBody ClienteRequest clienteRequest) {
        return paymentService.criarCliente(clienteRequest);
    }

    @PostMapping("/reembolsos")
    public String processarReembolso(@RequestBody ReembolsoRequest reembolsoRequest) {
        return paymentService.processarReembolso(reembolsoRequest);
    }

    @PostMapping("/webhook")
    public String receberWebhook(@RequestBody WebhookRequest webhookRequest) {
        return paymentService.receberWebhook(webhookRequest);
    }
}