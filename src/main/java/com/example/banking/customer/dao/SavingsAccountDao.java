package com.example.banking.customer.dao;

import com.example.banking.customer.domain.SavingsAccount;
import org.springframework.data.repository.CrudRepository;

public interface SavingsAccountDao extends CrudRepository<SavingsAccount,Long> {
    SavingsAccount findByAccountNumber (int accountNumber);
}
