package com.dgdaniel.odoo.app.user;

import com.dgdaniel.odoo.app.task.TaskDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {
    @Override
    public TaskDTO createUser(TaskDTO taskDTO) {
        return null;
    }

    @Override
    public List<TaskDTO> getAllUsers() {
        return List.of();
    }

    @Override
    public TaskDTO getUserById(UUID id) {
        return null;
    }

    @Override
    public TaskDTO updateUser(UUID id, TaskDTO taskDTO) {
        return null;
    }

    @Override
    public void deleteUser(UUID id) {

    }
}
