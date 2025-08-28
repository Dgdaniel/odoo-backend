package com.dgdaniel.odoo.app.user;

import com.dgdaniel.odoo.app.task.TaskDTO;

import java.util.List;
import java.util.UUID;

public interface UsersService {

    UsersDTO createUser(UsersDTO usersDTO);
    List<UsersDTO> getAllUsers();
    UsersDTO getUserById(UUID id);
    UsersDTO updateUser(UUID id, UsersDTO usersDTO);
    void deleteUser(UUID id);
}
