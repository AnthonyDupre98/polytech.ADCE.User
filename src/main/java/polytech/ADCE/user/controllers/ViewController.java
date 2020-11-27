package polytech.ADCE.user.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import polytech.ADCE.user.models.User;
import polytech.ADCE.user.repositories.AuthorityRepository;
import polytech.ADCE.user.repositories.UserRepository;

@Controller
public class ViewController {

    @GetMapping({"/login"})
    public String login() {	return "login"; }

}
