package com.example.demo.model.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.data.BankAccounts;
import com.example.demo.model.AccountOperation;
import com.example.demo.model.AccountOperationTypes;
import com.example.demo.model.BankAccount;

@Service
public class AccountOperationServiceImpl implements AccountOperationService {

	@Override
	public void deposit(double amount, Long accountId) {
		updateBankAccount(amount, accountId);
	}

	@Override
	public void widthdraw(double amount, Long accountId) {
		updateBankAccount(amount * -1, accountId);

	}

	@Override
	public void updateBankAccount(double amount, Long accountId) {
		Optional<BankAccount> b = BankAccounts.allBankAccounts.stream().filter(ba -> ba.getId().equals(accountId))
				.findFirst();
		if (b.isPresent()) {
			BankAccount bankAccount = b.get();
			List<AccountOperation> accountOperations = bankAccount.getAccountOperations();
			if (amount > 0) {
				accountOperations.add(new AccountOperation(LocalDateTime.now(), amount, AccountOperationTypes.DEPOSIT));

			} else {
				accountOperations
						.add(new AccountOperation(LocalDateTime.now(), amount, AccountOperationTypes.WIDTHDRAW));

			}
			bankAccount.setBalance(bankAccount.getBalance() + amount);
		}
		else {
	        throw new IllegalArgumentException("Account not found");

		}
		

	}

	@Override
	public List<AccountOperation> getAccountOperations(Long accountId) {
		Optional<BankAccount> b = BankAccounts.allBankAccounts.stream().filter(ba -> ba.getId().equals(accountId))
				.findFirst();
		if (b.isPresent()) {
			BankAccount bankAccount = b.get();

			return bankAccount.getAccountOperations();
		}
		else {
	        throw new IllegalArgumentException("Account not found");

		}
	}

}
