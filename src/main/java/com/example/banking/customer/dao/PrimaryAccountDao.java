package com.example.banking.customer.dao;

import com.example.banking.customer.domain.PrimaryAccount;
import org.springframework.data.repository.CrudRepository;

public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount,Long> {
    PrimaryAccount findByAccountNumber (int accountNumber);
}
