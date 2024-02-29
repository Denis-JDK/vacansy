package ru.best.candidate.vacansy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.best.candidate.vacansy.controller.mapper.ConvertMapper;
import ru.best.candidate.vacansy.dto.AccountDto;
import ru.best.candidate.vacansy.entity.AccountEntity;
import ru.best.candidate.vacansy.entity.UserEntity;
import ru.best.candidate.vacansy.repository.AccountRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    public List<AccountDto> findAll() {
        List<AccountEntity> accountEntities = accountRepository.findAll();
        return accountEntities.stream().map(it->ConvertMapper.accountEntityToDto(it)).collect(Collectors.toList());
    }

    public AccountDto findById(Long id) {
    AccountEntity accountEntity = accountRepository.findById(id).orElseThrow(()->new NoSuchElementException(String.format("account with id - %s was not found", id)));
        return ConvertMapper.accountEntityToDto(accountEntity);
    }

    public AccountDto save(AccountDto accountDto) {
        AccountEntity accountEntity = ConvertMapper.accountDtoToEntity(accountDto);
        return ConvertMapper.accountEntityToDto(accountEntity);
    }

    public AccountDto update(AccountDto accountDto) {
        AccountDto modelDB = findById(accountDto.getId());
        if (modelDB==null) {
            //todo throws new exception!!
            return null;
        } else {
            accountDto.setId(modelDB.getId());
            deleteById(modelDB.getId());
            save(accountDto);
        }
        return accountDto;
    }

    public void deleteById(Long id) {
        accountRepository.deleteById(id);
    }
}
