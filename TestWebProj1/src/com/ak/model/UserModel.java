package com.ak.model;

public class UserModel {

	public boolean validate(String name, String password) {

		if(name.equals("akhil") && password.equals("ak")){
			return true;
		} 
		return false;
		
	}
}
