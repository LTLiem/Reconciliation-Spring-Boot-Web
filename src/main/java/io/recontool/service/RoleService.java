package io.recontool.service;

import java.util.List;

import io.recontool.model.Role;

public interface RoleService {
	
	public void createRole(Role role);
	
	public void deleteRole(Role role);
	
	public void updateRole(Role role);
	
	public List<Role> getAllRole(); 
	
	public Role getRoleByName(String name);
}
