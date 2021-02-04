package com.example.demobeans;

import org.springframework.stereotype.Repository;

@Repository("prodrepo")
public class BankProdRepositoryImpl implements BankRepository{

    @Override
    public void updateTable() {
        System.out.println("updating prod table in BankRepositoryImpl....");
    }

    @Override
    public String toString() {
        return "BankProdRepositoryImpl{}";
    }
}
