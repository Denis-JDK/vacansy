package ru.best.candidate.vacansy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.best.candidate.vacansy.model.UserModel;
import ru.best.candidate.vacansy.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public List<UserModel> findAll() {
        return repository.findAll();
    }
}
