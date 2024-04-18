package dev.otee.zinc.api.controller;

import dev.otee.zinc.ZincService;
import dev.otee.zinc.api.schema.NoteResponse;
import dev.otee.zinc.api.schema.ResponseBody;
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
    public ResponseEntity<ResponseBody> create(@RequestBody Note note){
        Note response = service.insert(note);
        if (response == null){
            return NoteResponse.error("Title or Tag Missing", HttpStatus.BAD_REQUEST);

        }
        return NoteResponse.ok(note, "Note Created", response.getId(), HttpStatus.CREATED);

    }
}
