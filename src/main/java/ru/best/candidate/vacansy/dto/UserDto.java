package ru.best.candidate.vacansy.dto;


import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class UserDto {

    private Long id;
    private String telephone;
    private String email;
    private String name;
    private String patronymic;
    private String surname;
    private LocalDateTime dateOfBirth;
}
