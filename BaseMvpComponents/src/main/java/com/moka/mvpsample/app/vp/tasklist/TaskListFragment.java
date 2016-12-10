package com.moka.mvpsample.app.vp.tasklist;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
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
		View rootView = inflater.inflate(R.layout.activity_task_list, container, false);
		Toolbar toolbar = (Toolbar) rootView.findViewById(R.id.toolbar);

		return rootView;
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
