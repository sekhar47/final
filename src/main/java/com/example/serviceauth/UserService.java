package com.example.serviceauth;

import com.example.dto.UserDto;
import com.example.entity.User;

public interface UserService {
	
	User save(UserDto userDto);
	

}
