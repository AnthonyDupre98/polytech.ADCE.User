package polytech.ADCE.user.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import polytech.ADCE.user.models.User;
import polytech.ADCE.user.models.UserRegister;
import polytech.ADCE.user.repositories.AuthorityRepository;
import polytech.ADCE.user.repositories.UserRepository;

@Controller
@RequestMapping("/register")
public class RegisterController {

    @GetMapping
    public String register() {	return "register"; }

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthorityRepository authorityRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping
    public String register(@Validated @ModelAttribute("userregister")
                                   UserRegister user, BindingResult result) {
        User user1 = new User();
        user1.setUsername(user.getUsername());
        user1.setPassword(user.getPassword());
        System.out.println(user.toString());
        // check for errors ...
        // verify that username does not exist:
        if(userRepository.existsUserByUsername(user1.getUsername())) {
            return "register.jsp?user=true";
        }
        else if(!user.getMatchingpassword().equals(user.getPassword())){
            return "register.jsp?password=true";
        }
        else {	// encrypt password:
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            // save user object:
            userRepository.save(user1);
            // create/save an Authority obj ...
            return "login";
        }
    }
}
