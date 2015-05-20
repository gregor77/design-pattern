package com.design.user.psj.observer;

import java.util.Observable;

public class MultiLanguageManager extends Observable{
	private Locale locale;
	
	public void setLocale(Locale locale) {
		System.out.println("############### " + locale + " ##############");
		
		this.locale = locale;
		changeLocale();
	}

	public void changeLocale() {
		setChanged();
		notifyObservers();
	}
	
	public Locale getLocale() {
		return locale;
	}
}
