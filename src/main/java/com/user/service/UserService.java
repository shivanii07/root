package com.user.service;

import java.util.List;

import com.user.entity.User;

public interface UserService {
	public User getUser(Long id);

	public List<User> getUsers();

}
