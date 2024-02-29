package ru.best.candidate.vacansy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.best.candidate.vacansy.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{
}
