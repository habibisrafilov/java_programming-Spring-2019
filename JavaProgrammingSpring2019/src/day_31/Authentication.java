package day_31;

import java.util.Arrays;
import java.util.Scanner;

public class Authentication {
	public static void main(String[] args) {
	
	login("habib84","mentor001");	
	login("habib84","mentor002");
	}
	
	public static void login(String username,String password) {
		String validUsername = "habib84";
		String validPassword = "mentor001";
		
		if(username.equals(validUsername) && password.equals(validPassword)) {
			System.out.println("Login Successful!");
		}else {
			System.out.println("Sign in failed!");
		}
		
	}

}
