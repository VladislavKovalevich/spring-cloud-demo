package by.vlad.user.demo.microservice.controller.impl;

import by.vlad.user.demo.microservice.controller.UserController;
import by.vlad.user.demo.microservice.model.dto.UserResponseDto;
import by.vlad.user.demo.microservice.model.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserControllerImpl implements UserController {

    @Value("${application.message}")
    private String msg;

    @Override
    public ResponseEntity<UserResponseDto> generateUser(Long id) {
        User user = new User();
        user.setId(id);
        user.setSurname("Surname");

        UserResponseDto dto = new UserResponseDto();
        dto.setId(user.getId());
        dto.setName(msg);
        dto.setSurname(user.getSurname());

        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
