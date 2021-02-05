package com.example.demorestclient.controller;

import com.example.demorestclient.service.ClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping(path = "/callService")
    public void callService(){
        log.info("Calling service....");
        clientService.readFromService();
    }
}
