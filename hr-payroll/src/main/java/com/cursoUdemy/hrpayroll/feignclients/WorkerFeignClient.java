package com.cursoUdemy.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cursoUdemy.hrpayroll.model.Worker;

//configurando a comunicacao com o projeto worker

@Component
@FeignClient(name = "hr-worker", path ="/workers")
public interface WorkerFeignClient {
	
	@GetMapping(value = "/getById/{id}")
	ResponseEntity<Worker> getById(@PathVariable Long id);
}
