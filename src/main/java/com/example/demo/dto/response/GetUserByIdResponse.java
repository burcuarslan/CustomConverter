package com.example.demo.dto.response;

public class GetUserByIdResponse {

    private String name;

    private String email;

    public GetUserByIdResponse() {
    }

    public GetUserByIdResponse(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
