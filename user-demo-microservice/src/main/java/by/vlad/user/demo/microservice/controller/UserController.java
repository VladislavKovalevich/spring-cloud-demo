package by.vlad.user.demo.microservice.controller;

import by.vlad.user.demo.microservice.model.dto.UserResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
public interface UserController {

    @GetMapping("/{id}")
    ResponseEntity<UserResponseDto> generateUser(@PathVariable("id") Long id);
}
