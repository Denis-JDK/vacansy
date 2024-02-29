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

    public AccountModel save(AccountModel accountModel) {
        return accountRepository.save(accountModel);
    }

    public AccountModel update(AccountModel accountModel) {
        AccountModel modelDB = findById(accountModel.getId());
        if (modelDB==null) {
            //todo throws new exception!!
            return null;
        } else {
            accountRepository.save(accountModel);
        }
        return accountModel;
    }

    public void deleteById(Long id) {
        accountRepository.deleteById(id);
    }
}
