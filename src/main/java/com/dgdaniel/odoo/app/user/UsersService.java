package com.dgdaniel.odoo.app.user;

import com.dgdaniel.odoo.app.task.TaskDTO;

import java.util.List;
import java.util.UUID;

public interface UsersService {

    TaskDTO createUser(TaskDTO taskDTO);
    List<TaskDTO> getAllUsers();
    TaskDTO getUserById(UUID id);
    TaskDTO updateUser(UUID id, TaskDTO taskDTO);
    void deleteUser(UUID id);
}
