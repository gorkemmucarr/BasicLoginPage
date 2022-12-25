package com.example.loginpage.Service;

import com.example.loginpage.Model.User;
import com.example.loginpage.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

@Service
public class userService {

    @Autowired
    private UserRepository userRepository;

    public String loginuser(User user) {
        String userId = user.getUserId();
        User userObject = userRepository.findByUserId(userId);

        if (user.getPassword().equals(userObject.getPassword())) {
            return "home";
        } else {
            return "error";
        }
    }
}
