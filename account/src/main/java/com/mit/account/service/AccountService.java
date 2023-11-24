package com.mit.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mit.account.dto.AccountDTO;
import com.mit.account.dto.RequestDTO;
import com.mit.account.kafkaService.KafkaProducer;
import com.mit.account.model.AccountEntity;
import com.mit.account.repository.AccountRepository;
import com.mit.account.serviceInterface.AccountServiceInterface;
import com.mit.account.util.InfoLogService;

import jakarta.transaction.Transactional;

@Service
public class AccountService implements AccountServiceInterface {
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private KafkaProducer kafkaProducer;
	
	@Override
	@Transactional
	public void saveAccount(RequestDTO requestDTO) {
		  try {
		        InfoLogService.log("Before Save");

		        if (requestDTO.getAccountDTO().getStatus() != 0) {
		            // Batch update without retrieving the current balance first
		            accountRepository.updateCurrentBalanceIncrement(requestDTO.getAccountDTO().getAmount(), requestDTO.getAccountDTO().getAccNumber());
		        } else {
		            // Batch update without retrieving the current balance first
		            accountRepository.updateCurrentBalanceDecrement(requestDTO.getAccountDTO().getAmount(), requestDTO.getAccountDTO().getAccNumber());
		        }

		        InfoLogService.log("After Save");
		    } catch (Exception e) {
		        InfoLogService.log("Error Save" + e);
		    }
	}

}
