package com.cursoUdemy.hrworker.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursoUdemy.hrworker.model.Worker;
import com.cursoUdemy.hrworker.service.WorkerService;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {
	
	private static Logger logger = LoggerFactory.getLogger(WorkerController.class);
	
	
	@Autowired
	private Environment env;
	
	@Autowired
	private WorkerService workerService;
	
	@GetMapping(value = "/getAllWorkers")
	public ResponseEntity<List<Worker>> getAllWorkers(){
		return new ResponseEntity<>(workerService.getAllWorkers(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/getById/{id}")
	public ResponseEntity<Worker> getById(@PathVariable Long id){
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("PORT = " + env.getProperty("local.server.port"));
		return  new ResponseEntity<>(workerService.getById(id), HttpStatus.OK);
	}

}
