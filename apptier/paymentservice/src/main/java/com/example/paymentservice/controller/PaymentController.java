package com.example.paymentservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @GetMapping
    public String getPayment() {
        return "Payment service is working";
    }
}

