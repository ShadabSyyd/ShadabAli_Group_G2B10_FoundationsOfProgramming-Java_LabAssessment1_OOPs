package com.greatlearning.main;

import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialsService;
import java.util.Scanner;
public class AppMain {
	public static void main(String[] args) {
		//entry point to the appln
		//user input options for departments
		Employee emp1=new Employee("Rahul","Singh");
		ICredentials credObj=new CredentialsService();
		System.out.println("Please choose the department from the following options");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		Scanner inp=new Scanner(System.in);
		int choice=inp.nextInt();
		inp.close();
		String defEmail=null;
		String defPass=null;
		
		switch(choice) {
		case 1: {
			defEmail= credObj.generateEmailAddress(emp1.getFirstName().toLowerCase(),emp1.getLastName().toLowerCase(), "tech",emp1.getCompany().toLowerCase());
			defPass = credObj.generatePassword();
			break;
		}
		case 2: {
			defEmail= credObj.generateEmailAddress(emp1.getFirstName().toLowerCase(),emp1.getLastName().toLowerCase(), "adm",emp1.getCompany().toLowerCase());
			defPass = credObj.generatePassword();
			break;
		}
		case 3: {
			//dept is technical, short form is tech
			defEmail= credObj.generateEmailAddress(emp1.getFirstName().toLowerCase(),emp1.getLastName().toLowerCase(), "hr",emp1.getCompany().toLowerCase());
			defPass = credObj.generatePassword();
			break;
		}
		case 4: {
			defEmail= credObj.generateEmailAddress(emp1.getFirstName().toLowerCase(),emp1.getLastName().toLowerCase(), "leg",emp1.getCompany().toLowerCase());
			defPass = credObj.generatePassword();
			break;
		}
		}
		emp1.setEmail(defEmail);
		emp1.setPassGen(defPass);
		credObj.showCredentials(emp1);
		}
}