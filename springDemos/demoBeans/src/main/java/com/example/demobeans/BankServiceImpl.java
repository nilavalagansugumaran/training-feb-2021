package com.example.demobeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype") // TO ADD SCOPE
@Lazy // to delay bean creation
public class BankServiceImpl implements BankService{

    @Override
    public String toString() {
        return "BankServiceImpl{}";
    }
}
