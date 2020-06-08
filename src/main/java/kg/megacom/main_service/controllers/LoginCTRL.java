package kg.megacom.main_service.controllers;

import kg.megacom.main_service.microservices.LoginServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/auth")
public class LoginCTRL {
    @Autowired
    private LoginServiceFeign serviceFeign;
    @PostMapping("/signup")
    public ResponseEntity registerUser(@RequestParam String login, @RequestParam String password){
return serviceFeign.signUp(login,password);
    }
@PostMapping("/login")
    public ResponseEntity login(@RequestParam String login, @RequestParam String password){
        String token=serviceFeign.login(login,password);
    System.out.printf(token);
return ResponseEntity.ok(token);
    }
}
