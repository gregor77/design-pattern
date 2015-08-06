package com.design.patterns.adpter.common;

public class Alian implements AlianInterface{
	private String message;
	
	public Alian(String message) {
		this.message = message;
	}
	
	@Override
	public void telepathy() {
		System.out.println("communicate for Telepathy.." + message);
	}
}
