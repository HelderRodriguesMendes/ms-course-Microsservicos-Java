package com.cursoUdemy.hrworker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursoUdemy.hrworker.model.Worker;
import com.cursoUdemy.hrworker.repository.WorkerRepository;

@Service
public class WorkerService {
	
	@Autowired
	private WorkerRepository workerRepository;
	
	public List<Worker> getAllWorkers(){
		return workerRepository.findAll();
	}
	
	public Worker getById(Long id) {
		return workerRepository.findById(id).get();
	}
}
