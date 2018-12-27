package com.npr.memento.service;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.npr.memento.model.User;

@Component
public class UserService {

	public Response readAll() {
		User u = new User();
		u.setUsername("npr...test...");
		return Response.ok(u).build();
	}
	
	

}
