package com.example.demobeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Scope("prototype") // TO ADD SCOPE
@Lazy // to delay bean creation
public class BankServiceImpl implements BankService{

    //Dependency Injections
    @Autowired(required = false) // property injection - way1
   // @Qualifier("prodrepo") // use to choose from multiple beans
    @Qualifier("bankRepositoryImpl")
    private BankRepository repository; // define default = new BankRepositoryImpl();

    //Dependency Injections
    @Autowired(required = false) // property injection as list - way3
    private List<BankRepository> repositoryList;


//    @Autowired // constructor DI - way 2 (preferred)
//    public BankServiceImpl(BankRepository repository){
//        this.repository = repository;
//    }

    @Override
    public void takeDeposit() {
        System.out.println("taking deposit from BankServiceImpl....");
        //repository = new BankRepositoryImpl(); - not required as this is not a Spring way of dealing with beans
        repository.updateTable();
        System.out.println("taking deposit complete at BankServiceImpl....");

        // process the list of beans
        for(BankRepository repo: repositoryList) {
            repo.updateTable();
        }
    }

    @Override
    public String toString() {
        return "BankServiceImpl{}";
    }
}
