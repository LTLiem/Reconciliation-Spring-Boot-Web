package io.recontool.repository;

import org.springframework.data.repository.CrudRepository;

import io.recontool.model.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {
	public Role findByName(String name);
}
