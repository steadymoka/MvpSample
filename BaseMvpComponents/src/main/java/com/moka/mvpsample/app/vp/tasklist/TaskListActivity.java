package com.moka.mvpsample.app.vp.tasklist;


import android.os.Bundle;
import android.support.annotation.Nullable;

import com.moka.mvpsample.R;
import com.moka.mvpsample._framework.base.BaseActivity;


public class TaskListActivity extends BaseActivity {

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_task_list);
		getSupportFragmentManager()
				.beginTransaction()
				.replace(R.id.frameLayout, new TaskListFragment())
				.commit();
	}

}
