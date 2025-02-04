package com.vhaporfiro.ProjetoWebServices.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vhaporfiro.ProjetoWebServices.entities.User;


@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Matheus", "matheus@gmail.com", "61234123412", "ASDFGAWSERFGERW");
        return ResponseEntity.ok().body(u);
    }
}
