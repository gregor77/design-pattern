package com.design.psj.observer.listener;

import java.util.Observable;
import java.util.Observer;

import com.design.psj.observer.Locale;
import com.design.psj.observer.MultiLanguageManager;

public class TaskObserver implements Observer, CommonNode {

	private Observable observable;
	private Locale locale;
	private String name;

	public TaskObserver(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	@Override
	public void update(Observable paramObservable, Object paramObject) {
		if (paramObservable instanceof MultiLanguageManager) {
			this.locale = ((MultiLanguageManager) paramObservable).getLocale();
		}
		getNodeName();
	}

	@Override
	public String getNodeName() {
		if (Locale.LOCALE_KO.equals(locale)) {
			name = "업무";
		} else if (Locale.LOCALE_EN.equals(locale)) {
			name = "Task";
		} else if (Locale.LOCALE_ZH.equals(locale)) {
			name = "任務";
		} else {
			name = "Task";
		}
		
		return "# Taks 다국어 적용 : " + name;
	}

}