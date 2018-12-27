package com.npr.memento.config;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

import com.npr.memento.controller.UserController;

public class RestResourceConfig extends ResourceConfig {
	
	public RestResourceConfig(){
		register(JacksonFeature.class);
		register(UserController.class);
	}

}
