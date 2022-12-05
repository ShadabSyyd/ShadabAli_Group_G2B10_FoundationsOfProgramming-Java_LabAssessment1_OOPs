package com.greatlearning.service;

import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.model.Employee;
import java.util.Random;

public class CredentialsService implements ICredentials {

	@Override
	public String generateEmailAddress(String firstName, String lastName, String department, String company) {
		String email=firstName+lastName+"@"+department+"."+company+".com";
		return email;
	}
	
	@Override
	public String generatePassword() {
		String passAlpha="A#Ugh567Foprsmnv4ST$8ZwxyRdGNOPqKBEL90!QHIJ@ijkl";
		Random randNo=new Random();
		String passGen = "";
		for (int i=0;i<8;i++) {
		int numVal=passAlpha.length();
		int randAlphaGen=randNo.nextInt(numVal);
		char valResult=passAlpha.charAt(randAlphaGen);
		passGen+=String.valueOf(valResult);
		}
		return passGen;
	}

	@Override
	public void showCredentials(Employee employee) {
		System.out.printf("Dear %s your generated credentials are\n",employee.getFirstName());
		System.out.printf("Email: %s\n",employee.getEmail());
		System.out.printf("Password: %s\n",employee.getPassGen());
		
	}
	
}