package com.dgdaniel.odoo.app.user;

import com.dgdaniel.odoo.app.task.TaskDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsersDTO {
    private UUID id;
    private String firstName;
    private String lastName;
    private String address;

    private String username;
    private String password;
    private String email;
    private String phone;
    private Set<TaskDTO> tasks;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
