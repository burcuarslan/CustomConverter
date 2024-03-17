package com.example.demo.service.impl;

import com.example.demo.core.utilities.converter.ModelConverterService;
import com.example.demo.dao.UserRepository;
import com.example.demo.dto.request.CreateUserRequest;
import com.example.demo.dto.response.GetAllUser;
import com.example.demo.dto.response.GetUserByIdResponse;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private ModelConverterService modelConverterService;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, ModelConverterService modelConverterService) {
        this.userRepository = userRepository;
        this.modelConverterService = modelConverterService;
    }

    @Override
    public List<GetAllUser> getAll() {
        List<GetAllUser> getAllUser = modelConverterService.convertResponse(userRepository.findAll(), GetAllUser.class);
        return getAllUser;
    }

    @Override
    public GetUserByIdResponse getById(long id) {
        return modelConverterService.convertResponse(userRepository.findById(id), GetUserByIdResponse.class);
    }

    @Override
    public void create(CreateUserRequest user) {
        userRepository.save(modelConverterService.convertRequest(user, User.class));
    }
}
