package ru.best.candidate.vacansy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.best.candidate.vacansy.dto.AccountDto;
import ru.best.candidate.vacansy.entity.AccountEntity;
import ru.best.candidate.vacansy.service.AccountService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/account")
public class AccountController {

    private final AccountService accountService;
    @GetMapping
    public List<AccountDto> findAll() {
        return accountService.findAll();
    }
    @GetMapping("/{id}")
    public AccountDto findById(@PathVariable Long id) {
        return accountService.findById(id);
    }

    @PostMapping
    public ResponseEntity<AccountDto> createAccountModel(@RequestBody AccountDto accountDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(accountService.save(accountDto)) ;
    }

//    @PutMapping
//    public AccountDto updateAccountModel(@RequestBody AccountDto accountDto) {
//        return accountService.update(accountDto);
//    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        accountService.deleteById(id);
    }

}
