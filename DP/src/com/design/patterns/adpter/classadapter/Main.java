package com.design.patterns.adpter.classadapter;

import com.design.patterns.adpter.common.Alian;

public class Main {
	public static void main(String[] args) {
		Alian alian = new Alian("나는 외계인이다...");
		alian.telepathy();

		EarthianClazzAdapter earthianAdapter = new EarthianClazzAdapter("안녕 나는 지구인이야...");
		earthianAdapter.voice();
	}
}
