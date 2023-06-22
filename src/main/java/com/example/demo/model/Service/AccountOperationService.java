package com.example.demo.model.Service;

import java.util.List;

import com.example.demo.model.AccountOperation;

public interface AccountOperationService {
	void deposit(double amount,Long accountId);
	void widthdraw(double amount,Long accountId);
	void updateBankAccount(double amount,Long accountId);
	List<AccountOperation> getAccountOperations(Long accountId);
}
