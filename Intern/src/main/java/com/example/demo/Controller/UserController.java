package com.example.demo.Controller;

import com.example.demo.Model.User;
import com.example.demo.Severice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String showUsers(Model model) {
        List<User> users = userService.getUserByUsername("admin");
        model.addAttribute("users", users);
        return "view.html";
    }


}
