package dev.otee.zinc.controller;

import dev.otee.zinc.ZincService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZincController {
    @Autowired
    private ZincService service;
    @GetMapping("/")
    String helloWorld(){
        String response = service.healthCheck();
        return response;
    }
    @GetMapping("/insert")
    String insertOne(){
        String response = service.insert();
        return response;
    }
}
