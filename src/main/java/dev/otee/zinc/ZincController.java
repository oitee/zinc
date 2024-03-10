package dev.otee.zinc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZincController {
    @GetMapping("/")
    String helloWorld(){
        return "Hello World";
    }
}
