package com.example.demo.service;

import com.example.demo.dto.request.CreateUserRequest;
import com.example.demo.dto.response.GetAllUser;
import com.example.demo.dto.response.GetUserByIdResponse;
import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    List<GetAllUser> getAll();

    GetUserByIdResponse getById(long id);

    void create(CreateUserRequest user);

}
