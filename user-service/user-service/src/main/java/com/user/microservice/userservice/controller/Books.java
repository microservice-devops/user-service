package com.user.microservice.userservice.controller;

public class Books {

	private String name;
	private String discription;
	private String env;
	public Books() {}
	public Books(String name, String discription, String env) {
		super();
		this.name = name;
		this.discription = discription;
		this.env = env;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public String getEnv() {
		return env;
	}
	public void setEnv(String env) {
		this.env = env;
	}
	
	
}
