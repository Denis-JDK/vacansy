package ru.best.candidate.vacansy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.best.candidate.vacansy.entity.AccountEntity;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long>, PagingAndSortingRepository<AccountEntity, Long> {
}
