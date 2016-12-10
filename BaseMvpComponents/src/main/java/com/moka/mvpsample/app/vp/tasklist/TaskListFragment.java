package com.moka.mvpsample.app.vp.tasklist;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.moka.mvpsample.R;
import com.moka.mvpsample._framework.base.BaseMvpFragment;
import com.moka.mvpsample._framework.base.BasePresenter;


public class TaskListFragment extends BaseMvpFragment {

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);
		return inflater.inflate(R.layout.activity_task_list, container, false);
	}

	@Override
	public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);

	}

	@Override
	protected BasePresenter getPresenter() {
		return new TaskListPresenter();
	}

}
