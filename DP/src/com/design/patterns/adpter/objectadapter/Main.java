package com.design.patterns.adpter.objectadapter;

import com.design.patterns.adpter.common.Alian;

public class Main {
	public static void main(String[] args) {
		Alian alian = new Alian("나는 외계인이다...");
		alian.telepathy();

		EarthianInstanceAdapter earthianAdapter = new EarthianInstanceAdapter(new Alian("안녕..나는 지구인이야"));
		earthianAdapter.voice();
	}
}
