package io.recontool.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.recontool.model.User;
import io.recontool.repository.UserRepository;
import io.recontool.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	public void createUser(User user) {
		userRepository.save(user);	
	}

	public void deleteUser(User user) {
		userRepository.delete(user);
	}
	
	public void updateUser(User user) {
		userRepository.save(user);		
	}

	public List<User> getAllUser() {
		List<User> userList = new ArrayList<User>();
		userRepository.findAll().forEach(userList::add);
		return userList;
	}

	public User getUserByName(String name) {
		return userRepository.findByName(name);
	}
	
}
