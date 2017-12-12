package com.jensen.steamlite.view.form;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.jensen.steamlite.model.bean.UserHandler;

@RequestScoped
@Named
public class SignUpHandler {

	private String userName;
	private String password;
	private String email;
	
	@Inject
	private UserHandler userHandler;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String sendTo() {
		return userHandler.signUp(userName, password, email);
	}
}
