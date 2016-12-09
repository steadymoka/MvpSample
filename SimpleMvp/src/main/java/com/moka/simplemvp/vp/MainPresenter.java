package com.moka.simplemvp.vp;


import com.moka.simplemvp.model.ITaskRepository;
import com.moka.simplemvp.model.Task;
import com.moka.simplemvp.model.TaskRepository;


public class MainPresenter {

	private IView view;
	private ITaskRepository taskRepository;

	public void attachView(IView view) {
		this.view = view;
		taskRepository = TaskRepository.getInstance();
	}

	public void loadTask() {
		Task task = taskRepository.getTask(1);
		view.setTaskTitle(task.getTitle());
	}

}
