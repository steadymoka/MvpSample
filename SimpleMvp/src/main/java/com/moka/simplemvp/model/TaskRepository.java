package com.moka.simplemvp.model;


import java.util.HashMap;


public class TaskRepository implements ITaskRepository {

	private static TaskRepository instance;
	private HashMap<Long, Task> taskList = new HashMap<>();

	private TaskRepository() {
	}

	public static TaskRepository getInstance() {
		if ( null == instance )
			instance = new TaskRepository();
		return instance;
	}

	@Override
	public Task getTask(long id) {
//		return taskList.get(id);

		Task task = new Task();
		task.setTitle("타이틀");
		task.setContent("콘텐트");
		return task;
	}

}
