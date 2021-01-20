package com.example.banking.customer.service;

import com.example.banking.customer.domain.PrimaryTransaction;
import com.example.banking.customer.domain.SavingsTransaction;

import java.util.List;

public interface TransactionService {
    List<PrimaryTransaction> findPrimaryTransactionList(String username);

    List<SavingsTransaction> findSavingsTransactionList(String username);

    void savePrimaryDepositTransaction(PrimaryTransaction primaryTransaction);

    void saveSavingsDepositTransaction(SavingsTransaction savingsTransaction);
}
