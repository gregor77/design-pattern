package com.design.patterns.adpter.classadapter;

import com.design.patterns.adpter.common.Alian;
import com.design.patterns.adpter.common.EarthianInterface;

public class EarthianClazzAdapter extends Alian implements EarthianInterface {

	public EarthianClazzAdapter(String message) {
		super(message);
	}

	@Override
	public void voice() {
		telepathy();
	}

}
