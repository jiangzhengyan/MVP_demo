package com.risenb.jingkai;

import android.app.Activity;
import com.robotium.recorder.executor.Executor;

@SuppressWarnings("rawtypes")
public class GuideUIExecutor extends Executor {

	@SuppressWarnings("unchecked")
	public GuideUIExecutor() throws Exception {
		super((Class<? extends Activity>) Class.forName("com.risenb.jingkai.ui.GuideUI"),  "com.risenb.jingkai.R.id.", new android.R.id(), false, false, "1491984777216");
	}

	public void setUp() throws Exception { 
		super.setUp();
	}
}
