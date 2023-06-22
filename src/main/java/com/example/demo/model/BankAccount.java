package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BankAccount {
	
private Long id;	
private Double balance;
private List<AccountOperation> accountOperations;
public BankAccount(Long id, Double balance) {
	this.id = id;
	this.balance = balance;
	this.accountOperations = new ArrayList<>();
}

	
}
