package com.moka.mvpsample.app.vp.tasklist;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.moka.mvpsample.R;
import com.moka.mvpsample._framework.base.BaseMvpFragment;
import com.moka.mvpsample._framework.base.BasePresenter;
import com.moka.mvpsample._framework.widget.toolbar.ToolbarLayout;


public class TaskListFragment extends BaseMvpFragment {

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);
		View rootView = inflater.inflate(R.layout.fragment_task_list, container, false);

		setRootView(rootView);
		initView();

		return rootView;
	}
	private void initView() {
		ToolbarLayout toolbar = (ToolbarLayout) findViewById(R.id.toolbar);
		toolbar.visibleHome(false);
	}

	@Override
	protected BasePresenter getPresenter() {
		return new TaskListPresenter();
	}

	@Override
	public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);

	}

}
