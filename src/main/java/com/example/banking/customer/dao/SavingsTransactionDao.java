package com.example.banking.customer.dao;

import com.example.banking.customer.domain.SavingsTransaction;
import org.springframework.data.repository.CrudRepository;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction,Long> {
}
