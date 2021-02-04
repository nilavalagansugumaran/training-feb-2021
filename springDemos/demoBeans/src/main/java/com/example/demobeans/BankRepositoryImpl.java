package com.example.demobeans;

import org.springframework.stereotype.Repository;

@Repository
public class BankRepositoryImpl implements BankRepository{
    @Override
    public String toString() {
        return "BankRepositoryImpl{}";
    }
}
