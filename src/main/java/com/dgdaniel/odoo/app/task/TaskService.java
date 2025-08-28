package com.dgdaniel.odoo.app.task;

import java.util.List;
import java.util.UUID;

public interface TaskService {
    TaskDTO createTask(TaskDTO taskDTO);
    List<TaskDTO> getAllTasks();
    TaskDTO getTaskById(UUID id);
    TaskDTO updateTask(UUID id, TaskDTO taskDTO);
    void deleteTask(UUID id);
}
