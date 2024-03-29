package ru.best.candidate.vacansy.controller.mapper;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.mapstruct.Mapper;
import ru.best.candidate.vacansy.dto.AccountDto;
import ru.best.candidate.vacansy.dto.UserDto;
import ru.best.candidate.vacansy.entity.AccountEntity;
import ru.best.candidate.vacansy.entity.UserEntity;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ConvertMapper {

    public static UserEntity userDtoToEntity(UserDto dto) {
        UserEntity userEntity = new UserEntity(dto.getId(),dto.getName(), dto.getPatronymic(), dto.getSurname(), dto.getTelephone(),dto.getEmail(), dto.getDateOfBirth());
        return userEntity;
    }

    public static AccountEntity accountDtoToEntity(AccountDto dto) {
        AccountEntity accountEntity = new AccountEntity(dto.getId(),dto.getUserId(),dto.getNumber(),dto.getAmount());
        return accountEntity;
    }
    
    public static UserDto userEntityToDto(UserEntity entity) {
       return UserDto.builder().id(entity.getId()).telephone(entity.getTelephone()).email(entity.getEmail()).build();

    }

    public static AccountDto accountEntityToDto(AccountEntity entity) {
        return AccountDto.builder().id(entity.getId()).userId(entity.getUserId()).number(entity.getNumber()).amount(entity.getAmount()).build();
    }

}
