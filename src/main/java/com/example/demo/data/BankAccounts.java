package com.example.demo.data;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.BankAccount;

public class BankAccounts {
	
	public static List<BankAccount> allBankAccounts = new ArrayList<>();
	
	public BankAccounts() {
		allBankAccounts.add(new BankAccount(1L,0.0));
		allBankAccounts.add(new BankAccount(2L,0.0));		
		allBankAccounts.add(new BankAccount(3L,0.0));
	}
	

}
