package com.dgdaniel.odoo.app.task;

import com.dgdaniel.odoo.app.user.UsersDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TaskDTO {
    private UUID id;
    private String title;
    private String description;
    private String status;
    private String priority;
    private LocalDateTime deadline;
    private LocalDateTime createdAt;
    private UsersDTO user;
}
