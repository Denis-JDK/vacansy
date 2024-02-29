package ru.best.candidate.vacansy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.best.candidate.vacansy.model.AccountModel;
import ru.best.candidate.vacansy.repository.AccountRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    public List<AccountModel> findAll() {
      //  return accountRepository.findAll();
        return null;
    }

    public AccountModel findById(Long id) {
     //   return accountRepository.findById(id);
        return null;
    }
}
