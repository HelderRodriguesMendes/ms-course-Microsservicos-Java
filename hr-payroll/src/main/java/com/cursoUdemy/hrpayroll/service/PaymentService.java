package com.cursoUdemy.hrpayroll.service;

import org.springframework.stereotype.Service;

import com.cursoUdemy.hrpayroll.model.Payment;

@Service
public class PaymentService {
	public Payment getPayment(Long id, int days) {
		return new Payment("Bob", 200.0, days);
	}
}
