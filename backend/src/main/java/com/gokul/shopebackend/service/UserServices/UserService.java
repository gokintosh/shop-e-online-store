package com.gokul.shopebackend.service.UserServices;


import com.gokul.shopebackend.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;


public interface UserService {
    User findByMobile(String mobile) throws Exception;
    User getUserDetailById(long userId)throws Exception;
    User signUpUser(HashMap<String,String>signupRequest)throws Exception;
}
