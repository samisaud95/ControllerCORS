package com.example.exampleCors;

import jakarta.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/info")
public class NomeController {
    @GetMapping("/user")
    public String user(
            @RequestParam String nome,
            @RequestParam String cognome){
        return "the information about :" + nome +" "+ cognome;
    }
    @PostMapping("/userinfo")
    public User userinfo(@RequestBody User user){
        return user;
    }

}
