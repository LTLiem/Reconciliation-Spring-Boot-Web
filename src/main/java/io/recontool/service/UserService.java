package io.recontool.service;

import java.util.List;

import io.recontool.model.User;

public interface UserService {
	
	public void createUser(User user);
	
	public void deleteUser(User user);
	
	public void updateUser(User user);
	
	public List<User> getAllUser(); 
	
	public User getUserByName(String name);
	
}
