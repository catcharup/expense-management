package com.account.manager.web.rest;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseManagerRestService {
	
	@RequestMapping("/{user}/accounts")
	private List<String> getAccounts(){
		return null;
	}

}
