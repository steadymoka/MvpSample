package com.moka.simplemvp.vp;


import com.moka.simplemvp.model.Task;
import com.moka.simplemvp.model.TaskRepository;


public class MainPresenter {

	private IView view;

	public void attachView(IView view) {
		this.view = view;
	}

	public void loadTask() {
		Task task = TaskRepository.getInstance().getTask(1);
		view.setTaskTitle(task.getTitle());
	}

}
