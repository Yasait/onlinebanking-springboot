package com.example.banking.customer.service;

import com.example.banking.customer.domain.PrimaryAccount;
import com.example.banking.customer.domain.SavingsAccount;

import java.security.Principal;

public interface AccountService {
    PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
}
