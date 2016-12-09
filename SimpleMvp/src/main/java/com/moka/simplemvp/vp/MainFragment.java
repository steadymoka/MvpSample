package com.moka.simplemvp.vp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.moka.simplemvp.R;
import com.moka.simplemvp.model.Task;
import com.moka.simplemvp.model.TaskRepository;


public class MainFragment extends Fragment {

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main, container, false);

		TextView textView_taskTitle = (TextView) rootView.findViewById(R.id.textView_taskTitle);

		Task task = TaskRepository.getInstance().getTask(1);
		textView_taskTitle.setText(task.getTitle());

		return rootView;
	}

}
