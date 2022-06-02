package com.cursoUdemy.hrpayroll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursoUdemy.hrpayroll.feignclients.WorkerFeignClient;
import com.cursoUdemy.hrpayroll.model.Payment;
import com.cursoUdemy.hrpayroll.model.Worker;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient; 
	
	public Payment getPayment(Long workerId, int days) {
		
		Worker worker = workerFeignClient.getById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
