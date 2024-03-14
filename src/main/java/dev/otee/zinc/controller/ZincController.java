package dev.otee.zinc.controller;

import dev.otee.zinc.ZincService;
import dev.otee.zinc.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @PostMapping("/note")
    public Note create(@RequestBody Note note){
        return service.insert(note);
    }
}
