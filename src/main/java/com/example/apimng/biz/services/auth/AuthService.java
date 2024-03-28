package com.example.apimng.biz.services.auth;

import com.example.apimng.biz.dto.SignupDTO;
import com.example.apimng.biz.dto.UserDTO;

public interface AuthService {
    UserDTO createUser(SignupDTO signupDTO);
}
