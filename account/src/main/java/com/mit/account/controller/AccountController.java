package com.mit.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mit.account.dto.RequestDTO;
import com.mit.account.kafkaService.KafkaProducer;
import com.mit.account.serviceInterface.AccountServiceInterface;
import com.mit.account.util.InfoLogService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class AccountController {
	
	@Autowired
	private KafkaProducer kafkaProducer;
	@Autowired
	AccountServiceInterface accountServiceInterface;
	@PostMapping(value = "/save")
	@Async
	public void saveOrder(@RequestBody RequestDTO dto) {
	

			InfoLogService.log("Controller");
			kafkaProducer.sendTranscSuccess(dto.getAccountDTO());
			accountServiceInterface.saveAccount(dto);
			  

	}
}
