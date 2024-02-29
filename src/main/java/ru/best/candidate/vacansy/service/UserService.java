package ru.best.candidate.vacansy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.best.candidate.vacansy.model.UserModel;
import ru.best.candidate.vacansy.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<UserModel> findAll() {
        return userRepository.findAll();
    }

    public UserModel findById(Long id) {
        return userRepository.findById(id);
    }

    public UserModel save(UserModel userModel) {
        return userRepository.save(userModel);
    }

    public UserModel update(UserModel userModel) {
        UserModel modelDB = findById(userModel.getId());
        if (modelDB==null) {
            //todo throws new exception!!
            return null;
        } else {
            userRepository.save(userModel);
        }
        return userModel;
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
