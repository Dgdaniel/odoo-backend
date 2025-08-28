package com.dgdaniel.odoo.app.user;

import com.dgdaniel.odoo.app.task.TaskDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;
    private final UsersMapper usersMapper; // MapStruct

    @Override
    public UsersDTO createUser(UsersDTO usersDTO) {
        Users user = usersMapper.toEntity(usersDTO);
        user.setCreatedAt(LocalDateTime.now());
        Users savedUser = usersRepository.save(user);
        return usersMapper.toDto(savedUser);
    }

    @Override
    public List<UsersDTO> getAllUsers() {
        return usersRepository.findAll()
                .stream()
                .map(usersMapper::toDto)
                .toList();
    }

    @Override
    public UsersDTO getUserById(UUID id) {
        Users user = usersRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id " + id));
        return usersMapper.toDto(user);
    }

    @Override
    public UsersDTO updateUser(UUID id, UsersDTO usersDTO) {
        Users existingUser = usersRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id " + id));

        existingUser.setFirstName(usersDTO.getFirstName());
        existingUser.setLastName(usersDTO.getLastName());
        existingUser.setAddress(usersDTO.getAddress());
        existingUser.setUsername(usersDTO.getUsername());
        existingUser.setEmail(usersDTO.getEmail());
        existingUser.setPhone(usersDTO.getPhone());
        existingUser.setUpdatedAt(LocalDateTime.now());

        Users updatedUser = usersRepository.save(existingUser);
        return usersMapper.toDto(updatedUser);
    }

    @Override
    public void deleteUser(UUID id) {
        Users user = usersRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id " + id));
        user.setDeletedAt(LocalDateTime.now());
        usersRepository.save(user); // Soft delete
    }
}

