package ru.best.candidate.vacansy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.best.candidate.vacansy.controller.mapper.ConvertMapper;
import ru.best.candidate.vacansy.dto.UserDto;
import ru.best.candidate.vacansy.entity.AccountEntity;
import ru.best.candidate.vacansy.entity.UserEntity;
import ru.best.candidate.vacansy.repository.UserRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<UserDto> findAll() {
        List<UserEntity> userEntities = userRepository.findAll();
        return userEntities.stream().map(it->ConvertMapper.userEntityToDto(it)).collect(Collectors.toList());
    }

    public UserDto findById(Long id) {
        UserEntity userEntity = userRepository.findById(id).orElseThrow(()->new NoSuchElementException(String.format("user with id - %s was not found", id)));
        return ConvertMapper.userEntityToDto(userEntity);
    }

    public UserDto save(UserDto userDto) {
       UserEntity userEntity = ConvertMapper.userDtoToEntity(userDto);
        return ConvertMapper.userEntityToDto(userEntity);
    }

    public UserDto update(UserDto userDto) {
        UserDto modelDB = findById(userDto.getId());
        if (modelDB==null) {
            //todo throws new exception!!
            return null;
        } else {
            userDto.setId(modelDB.getId());
            deleteById(modelDB.getId());
            save(userDto);

        }
        return userDto;
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
