package com.design.user.psj.observer;

public enum Locale {
	KO("ko_KR"), EN("en_US"), ZH("zh_CN");
	
	private String localeCode;
	
	Locale(String localeCode) {
		this.localeCode = localeCode;
	}

	public String getLocaleCode() {
		return localeCode;
	}

	public void setLocale(String localeCode) {
		this.localeCode = localeCode;
	}
}
