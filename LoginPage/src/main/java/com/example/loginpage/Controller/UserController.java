package com.example.loginpage.Controller;

import com.example.loginpage.Model.User;
import com.example.loginpage.Repository.UserRepository;
import com.example.loginpage.Service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private com.example.loginpage.Service.userService userService;

    @GetMapping("/")
    public String login(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "login";
    }

    @PostMapping("/userlogin")
    public String loginuser(@ModelAttribute("user") User user){
       return userService.loginuser(user);
    }
}

