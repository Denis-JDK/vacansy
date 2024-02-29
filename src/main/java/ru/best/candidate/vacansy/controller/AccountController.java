package ru.best.candidate.vacansy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.best.candidate.vacansy.model.AccountModel;
import ru.best.candidate.vacansy.model.UserModel;
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

    @PostMapping
    public AccountModel createAccountModel(@RequestBody AccountModel accountModel) {
        return accountService.save(accountModel);
    }

    @PutMapping
    public AccountModel updateAccountModel(@RequestBody AccountModel accountModel) {
        return accountService.update(accountModel);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        accountService.deleteById(id);
    }

}
