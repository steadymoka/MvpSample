package com.moka.simplemvp.vp;


import com.moka.simplemvp.model.Task;
import com.moka.simplemvp.model.TaskRepository;


public class MainPresenter {

	private MainFragment mainFragment;

	public void attachView(MainFragment mainFragment) {
		this.mainFragment = mainFragment;
	}

	public void loadTask() {
		Task task = TaskRepository.getInstance().getTask(1);
		mainFragment.setTaskTitle(task.getTitle());
	}

}
