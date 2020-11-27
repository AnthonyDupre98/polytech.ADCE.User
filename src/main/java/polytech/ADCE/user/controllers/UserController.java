package polytech.ADCE.user.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import polytech.ADCE.user.models.User;
import polytech.ADCE.user.repositories.AuthorityRepository;
import polytech.ADCE.user.repositories.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {


}
