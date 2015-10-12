package com.design.patterns.adpter.objectadapter;

import com.design.patterns.adpter.common.Alian;
import com.design.patterns.adpter.common.EarthianInterface;

public class EarthianInstanceAdapter implements EarthianInterface {
	private Alian alian;
	
	public EarthianInstanceAdapter(Alian alian) {
		this.alian = alian;
	}

	@Override
	public void voice() {
		alian.telepathy();
	}

}
