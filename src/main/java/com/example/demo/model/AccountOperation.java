package com.example.demo.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountOperation {
	
	private LocalDateTime dateTime;
	private double amount ;
	private AccountOperationTypes operationType;

}
