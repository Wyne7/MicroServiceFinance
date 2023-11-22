package com.mit.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mit.account.model.AccountEntity;

import jakarta.transaction.Transactional;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long> {


    @Modifying
    @Transactional
    @Query(value = "update accounts set current_balance = current_balance + :amount where acc_number = :accNumber", nativeQuery = true)
    void updateCurrentBalanceIncrement(@Param("amount") Double amount, @Param("accNumber") String accNumber);

    @Modifying
    @Transactional
    @Query(value = "update accounts set current_balance = current_balance - :amount where acc_number = :accNumber", nativeQuery = true)
    void updateCurrentBalanceDecrement(@Param("amount") Double amount, @Param("accNumber") String accNumber);

}
