package ru.best.candidate.vacansy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.best.candidate.vacansy.model.AccountModel;
import ru.best.candidate.vacansy.model.UserModel;
import ru.best.candidate.vacansy.service.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/user")
public class UserController {

    private final UserService userService;
    @GetMapping
    public List<UserModel> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public UserModel findById(@PathVariable Long id) {
        return userService.findById(id);
    }
    @PostMapping
    public UserModel createUserModel(@RequestBody UserModel userModel) {
        return userService.save(userModel);
    }

    @PutMapping
    public UserModel updateUserModel(@RequestBody UserModel userModel) {
        return userService.update(userModel);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        userService.deleteById(id);
    }

}
