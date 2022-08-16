package com.renan.paymentservice.service;

import com.renan.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
