package ru.best.candidate.vacansy.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {

    private Long id;
    private String telephone;
    private String email;
}
