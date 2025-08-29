package com.dgdaniel.odoo.app.user;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UsersController {

    private final UsersService usersService;

    @PostMapping
    public ResponseEntity<UsersDTO> createUser(@RequestBody UsersDTO usersDTO) {
        UsersDTO createdUser = usersService.createUser(usersDTO);
        return status(HttpStatus.CREATED).body(createdUser);
    }

    @GetMapping
    public ResponseEntity<List<UsersDTO>> getAllUsers() {
        return ok(usersService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsersDTO> getUserById(@PathVariable UUID id) {
        return ok(usersService.getUserById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsersDTO> updateUser(
            @PathVariable UUID id,
            @RequestBody UsersDTO usersDTO) {
        return ok(usersService.updateUser(id, usersDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable UUID id) {
        usersService.deleteUser(id);
        return noContent().build();
    }
}

