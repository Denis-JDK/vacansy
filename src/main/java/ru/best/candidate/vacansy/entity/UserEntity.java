package ru.best.candidate.vacansy.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title")
    private String name;
    @Column(name = "patronymic")
    private String patronymic;
    @Column(name = "surname")
    private String surname;
    @Column(name = "telephone_number")
    private String telephone;
    @Column(name = "email")
    private String email;
    @Column(name = "birthday")
    private LocalDateTime dateOfBirth;


}
