package com.tiwari.service;

import com.tiwari.exception.UserException;
import com.tiwari.model.User;

public interface UserService {

	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public User findUserByEmail(String email) throws UserException;


}
