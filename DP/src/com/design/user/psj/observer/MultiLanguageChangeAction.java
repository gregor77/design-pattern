package com.design.user.psj.observer;

import java.util.Scanner;

import com.design.user.psj.observer.listener.ActivityObserver;
import com.design.user.psj.observer.listener.TaskObserver;

public class MultiLanguageChangeAction {
	public static void main(String[] args) {
		MultiLanguageManager manager = new MultiLanguageManager();
		ActivityObserver activityObserver = new ActivityObserver(manager);
		TaskObserver taskObserver = new TaskObserver(manager);
		
		System.out.println("변경할 다국어를 입력하세요.");

		Scanner sc = new Scanner(System.in);
		String strLocale = sc.nextLine().toUpperCase();
		
		manager.setLocale(Locale.valueOf(strLocale));
		System.out.println(activityObserver.getNodeName());
		System.out.println(taskObserver.getNodeName());
		
		sc.close();
	}
}
