package ru.best.candidate.vacansy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.best.candidate.vacansy.model.AccountModel;
import ru.best.candidate.vacansy.service.AccountService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/account")
public class AccountController {

    private final AccountService accountService;
    @GetMapping
    public List<AccountModel> findAll() {
        return accountService.findAll();
    }
    @GetMapping("/{id}")
    public AccountModel findById(@PathVariable Long id) {
        return accountService.findById(id);
    }
}
