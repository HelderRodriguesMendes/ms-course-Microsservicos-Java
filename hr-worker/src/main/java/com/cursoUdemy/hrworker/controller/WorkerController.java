package com.cursoUdemy.hrworker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@Autowired
	private WorkerService workerService;
	
	@GetMapping(value = "/getAllWorkers")
	public ResponseEntity<List<Worker>> getAllWorkers(){
		return new ResponseEntity<>(workerService.getAllWorkers(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/getById/{id}")
	public ResponseEntity<Worker> getById(@PathVariable Long id){
		return  new ResponseEntity<>(workerService.getById(id), HttpStatus.OK);
	}

}
