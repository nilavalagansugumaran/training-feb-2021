package com.example.demobeans;

import org.springframework.stereotype.Repository;

@Repository
public class BankRepositoryImpl implements BankRepository{

    @Override
    public void updateTable() {
        System.out.println("updating table in BankRepositoryImpl....");
    }

    @Override
    public String toString() {
        return "BankRepositoryImpl{}";
    }
}
