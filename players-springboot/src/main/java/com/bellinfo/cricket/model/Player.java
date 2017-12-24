package com.bellinfo.cricket.model;

public class Player {
	
	private String name;
	private String Score;
	private String role;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScore() {
		return Score;
	}
	public void setScore(String score) {
		Score = score;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", Score=" + Score + ", role=" + role + "]";
	}
	

}
