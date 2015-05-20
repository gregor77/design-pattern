package com.design.user.psj.observer;

public enum Locale {
	LOCALE_KO("ko_KR"), LOCALE_EN("en_US"), LOCALE_ZH("zh_CN");
	
	private String locale;
	
	Locale(String locale) {
		this.locale = locale;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}
}
