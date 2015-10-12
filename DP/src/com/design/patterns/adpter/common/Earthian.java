package com.design.patterns.adpter.common;

public class Earthian implements EarthianInterface {
	private String content;
	
	public Earthian(String content) {
		this.content = content;
	}
	
	@Override
	public void voice() {
		System.out.println("communicate for Voice...." + content);
	}
}
