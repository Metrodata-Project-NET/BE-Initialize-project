package com.metrodata.initialize_project.service;

import com.metrodata.initialize_project.entity.User;
import com.metrodata.initialize_project.model.UserRequest;
import com.metrodata.initialize_project.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public User create(UserRequest userRequest){
        // ENCAPCULATION
//        User user = new User();
//        user.setUsername(user.getUsername());
//        user.setPassword(user.getPassword());

//        BUILDER
//        User user = User.builder()
//                .username(userRequest.getUsername())
//                .password(userRequest.getPassword())
//                .build();

        // BEAN UTILS
        User user = new User();
        BeanUtils.copyProperties(userRequest, user);

        return userRepository.save(user);
    }

}
