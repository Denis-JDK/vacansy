package ru.best.candidate.vacansy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

}
