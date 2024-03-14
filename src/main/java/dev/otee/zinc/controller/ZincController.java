package dev.otee.zinc.controller;

import dev.otee.zinc.ZincService;
import dev.otee.zinc.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity create(@RequestBody Note note){
        Note response = service.insert(note);
        if (response == null){
            return new ResponseEntity<String>("Title or Tag Missing", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<Note>(response, HttpStatus.CREATED);
    }
}
