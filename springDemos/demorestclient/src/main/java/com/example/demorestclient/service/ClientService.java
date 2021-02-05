package com.example.demorestclient.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Service
@Slf4j
public class ClientService {

    private RestTemplate restTemplate; // rest client

    @Value("${employee.service.url}")
    private String serviceUrl;

    public void readFromService(){

        //Create headers
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type","application/xml");
        httpHeaders.add("Accept","application/xml");

        // Create body
        String messagebody = "<Employee>\n" +
                "    <id>201</id>\n" +
                "    <name>Nila 200</name>\n" +
                "    <salary>2400.5</salary>\n" +
                "</Employee>";

        //wrap both header and body into httpentity
        HttpEntity httpEntity = new HttpEntity(messagebody,httpHeaders);

        //Compile the request and send
       ResponseEntity<String> postResponse = restTemplate.exchange(serviceUrl, HttpMethod.POST,httpEntity,String.class);
        log.info("POST Response code from server =  {}", postResponse.getStatusCode());
        log.info("POST Response body from server =  {}", postResponse.getBody());

        //Create headers
        HttpHeaders getHttpHeaders = new HttpHeaders();
        getHttpHeaders.add("Content-Type","application/json");
        getHttpHeaders.add("Accept","application/json");

        HttpEntity newHttpEntity = new HttpEntity("",getHttpHeaders); // body not required for GET

        ResponseEntity<String> getResponse = restTemplate.exchange(serviceUrl+"?id=201", HttpMethod.GET,newHttpEntity,String.class);
        log.info("GET Response code from server =  {}", getResponse.getStatusCode());
        log.info("GET Response body from server =  {}", getResponse.getBody());

    }

    @PostConstruct
    public void init(){
        restTemplate = new RestTemplate();
    }
}
