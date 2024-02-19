package com.jwt.example.services;

import java.util.ArrayList;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.example.models.User;

import lombok.ToString;

@SuppressWarnings("unused")
@Service
public class UserService 
{
	private List<User> store = new ArrayList<>();
	
	public UserService()
	{
		store.add(new User(UUID.randomUUID().toString(), "Ishika Gupta", "ishika.gupta@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "Arvind Gupta", "arvind.gupta@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "Anupam Gupta", "anupam.gupta@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "Kishlay Gupta", "kishlay.gupta@gmail.com"));		
	}
	
	public List<User> getUsers()
	{
		return this.store;
	}
}
