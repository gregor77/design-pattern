package com.design.user.psj.observer;

import com.design.user.psj.observer.listener.ActivityObserver;
import com.design.user.psj.observer.listener.TaskObserver;

public class MultiLanguageChangeAction {
	public static void main(String[] args) {
		MultiLanguageManager manager = new MultiLanguageManager();
		ActivityObserver activityObserver = new ActivityObserver(manager);
		TaskObserver taskObserver = new TaskObserver(manager);
		
		//set Locale KO
		manager.setLocale(Locale.LOCALE_KO);
		System.out.println(activityObserver.getNodeName());
		System.out.println(taskObserver.getNodeName());
		
		//set Locale EN
		manager.setLocale(Locale.LOCALE_EN);
		System.out.println(activityObserver.getNodeName());
		System.out.println(taskObserver.getNodeName());
		
		//set Locale ZH
		manager.setLocale(Locale.LOCALE_ZH);
		System.out.println(activityObserver.getNodeName());
		System.out.println(taskObserver.getNodeName());
	}
}
