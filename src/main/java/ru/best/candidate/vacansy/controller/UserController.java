package ru.best.candidate.vacansy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.best.candidate.vacansy.dto.UserDto;
import ru.best.candidate.vacansy.service.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/user")
public class UserController {

    private final UserService userService;
    @GetMapping
    public List<UserDto> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public UserDto findById(@PathVariable Long id) {
        return userService.findById(id);
    }
    @PostMapping
    public UserDto createUserModel(@RequestBody UserDto userModel) {
        return userService.save(userModel);
    }

    @PutMapping
    public UserDto updateUserModel(@RequestBody UserDto userModel) {
        return userService.update(userModel);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        userService.deleteById(id);
    }

}
