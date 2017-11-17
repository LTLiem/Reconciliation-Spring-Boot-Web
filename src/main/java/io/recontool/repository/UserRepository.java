package io.recontool.repository;

import org.springframework.data.repository.CrudRepository;

import io.recontool.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	public User findByName(String name);
}
