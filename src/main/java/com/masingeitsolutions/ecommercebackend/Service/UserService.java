package com.masingeitsolutions.ecommercebackend.Service;

import com.masingeitsolutions.ecommercebackend.Domain.User;
import com.masingeitsolutions.ecommercebackend.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository userRepository;

    public User signUp(User user){
        return userRepository.save(user);
    }
}
