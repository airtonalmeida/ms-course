package br.com.dev.asa.hrpayroll.services;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import br.com.dev.asa.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Tom", new BigDecimal(200), days);
	}
}