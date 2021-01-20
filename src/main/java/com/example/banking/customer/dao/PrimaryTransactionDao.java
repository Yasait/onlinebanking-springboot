package com.example.banking.customer.dao;

import com.example.banking.customer.domain.PrimaryTransaction;
import org.springframework.data.repository.CrudRepository;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction,Long> {
}
