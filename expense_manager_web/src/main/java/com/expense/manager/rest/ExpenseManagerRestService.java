package com.expense.manager.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseManagerRestService {
	
	@RequestMapping(value="/{user}/accounts", method=RequestMethod.GET)
	private List<String> getAccounts(){
		List<String> accountList = new ArrayList<String>();
		accountList.add("8964587");
		accountList.add("7859684");
		
		return accountList;
	}
	
	
	@RequestMapping(value="/{account}", method=RequestMethod.GET)
	private String getName(@PathVariable(value="account") Integer account){
		if(account != null && account == 700109){
			return "ARUP";
		}else{
			return "MINI";
		}
		
	}
	 

}
