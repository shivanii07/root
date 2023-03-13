package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService{

	//fake user list( otherwise we have to load it from databse)
	
	List<User> list = List.of(
			new User(1311L, "Saurabh Saini","8218456636"),
			new User(1312L, "dhruv kweera","8218456637"),
			new User(1313L, "Bharat Singh","8218456638")
			
			);
	
	@Override
	public User getUser(Long id) {
		return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}
	public List<User> getUsers(){
		return list;
	}

}
