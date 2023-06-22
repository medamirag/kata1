package com.example.demo.model.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Service.AccountOperationService;

@RestController
@RequestMapping("api/v0/account/")
public class AccountController {

	@Autowired
    private  AccountOperationService accountOperationService;
    
    @PostMapping("/deposit/{accountId}")
    public void deposit(@PathVariable Long accountId, @RequestParam Double amount) {
    	accountOperationService.deposit(amount, accountId);
    	
    	}

    @PostMapping("/withdraw/{accountId}")
    public void withdraw(@PathVariable Long accountId, @RequestParam Double amount) {
    	accountOperationService.widthdraw(amount, accountId);
    	
    	}
    
    @GetMapping("/{accountId}")
    public void checkHistory(@PathVariable Long accountId) {
    	accountOperationService.getAccountOperations(accountId);
    	
    	}
    
	
}
