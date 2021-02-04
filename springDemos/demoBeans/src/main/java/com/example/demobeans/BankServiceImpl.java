package com.example.demobeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope("prototype") // TO ADD SCOPE
@Lazy // to delay bean creation
public class BankServiceImpl implements BankService{

    //Dependency Injections
    @Autowired // property injection - way1
    private BankRepository repository;

    @Override
    public void takeDeposit() {
        System.out.println("taking deposit from BankServiceImpl....");
        //repository = new BankRepositoryImpl(); - not required as this is not a Spring way of dealing with beans
        repository.updateTable();
        System.out.println("taking deposit complete at BankServiceImpl....");
    }

    @Override
    public String toString() {
        return "BankServiceImpl{}";
    }
}
