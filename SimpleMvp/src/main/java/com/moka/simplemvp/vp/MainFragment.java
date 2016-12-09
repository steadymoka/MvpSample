package com.moka.simplemvp.vp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.moka.simplemvp.R;


public class MainFragment extends Fragment {

	private MainPresenter presenter;

	private TextView textView_taskTitle;

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main, container, false);

		textView_taskTitle = (TextView) rootView.findViewById(R.id.textView_taskTitle);

		presenter = new MainPresenter();
		presenter.attachView(this);
		presenter.loadTask();

		return rootView;
	}

	public void setTaskTitle(String taskTitle) {
		textView_taskTitle.setText(taskTitle);
	}

}
