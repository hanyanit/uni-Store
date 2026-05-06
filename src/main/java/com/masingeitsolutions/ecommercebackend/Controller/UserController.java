package com.masingeitsolutions.ecommercebackend.Controller;

import com.masingeitsolutions.ecommercebackend.Domain.User;
import com.masingeitsolutions.ecommercebackend.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    UserService userService;

   @PostMapping("/signUp")
    public User SaveUser(User user){
       return userService.signUp(user);
   }



}
