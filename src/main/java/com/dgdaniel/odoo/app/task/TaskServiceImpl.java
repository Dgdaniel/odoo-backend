package com.dgdaniel.odoo.app.task;

import com.dgdaniel.odoo.app.user.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;
    private final UsersRepository  usersRepository;

    @Override
    public TaskDTO createTask(TaskDTO taskDTO) {
        Task task = taskMapper.toEntity(taskDTO);
        task.setId(null);
        task.setStatus("TODO");
        task.setCreatedAt(LocalDateTime.now());
        task.setUpdatedAt(LocalDateTime.now());
        if (taskDTO.getUser() != null && taskDTO.getUser().getId() != null) {
            usersRepository.findById(taskDTO.getUser().getId())
                    .ifPresent(task::setUser);
        }

        return taskMapper.toDto(taskRepository.save(task));
    }

    @Override
    public List<TaskDTO> getAllTasks() {
        return taskMapper.toDto(taskRepository.findAll());
    }

    @Override
    public TaskDTO getTaskById(UUID id) {
        return taskRepository.findById(id)
                .map(taskMapper::toDto)
                .orElseThrow(() -> new RuntimeException("Task not found"));
    }

    @Override
    public TaskDTO updateTask(UUID id, TaskDTO taskDTO) {
        return taskRepository.findById(id)
                .map(task -> {
                    task.setTitle(taskDTO.getTitle());
                    task.setDescription(taskDTO.getDescription());
                    task.setPriority(taskDTO.getPriority());
                    task.setStatus(taskDTO.getStatus());
                    task.setUpdatedAt(LocalDateTime.now());
                    if (taskDTO.getUser() != null && taskDTO.getUser().getId() != null) {
                        usersRepository.findById(taskDTO.getUser().getId())
                                .ifPresent(task::setUser);
                    }

                    return taskMapper.toDto(taskRepository.save(task));
                })
                .orElseThrow(() -> new RuntimeException("Task not found"));
    }


    @Override
    public void deleteTask(UUID id) {
        taskRepository.findById(id).ifPresent(task -> {
            task.setDeletedAt(LocalDateTime.now()); // soft delete
            taskRepository.save(task);
        });
    }
}
