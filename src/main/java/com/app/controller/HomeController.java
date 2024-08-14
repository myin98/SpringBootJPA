package com.app.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.UserEntity;
import com.app.service.UserService;



@RestController
public class HomeController {
	
	@Autowired
	private UserService us;
	

	@GetMapping("/")
	public List<UserEntity> home() {
		
		//return us.findByUserNmAndUserPwd();
		//return us.findByUserNm();
		//return "home";
		return us.findByUserNmContaining();
	}
	
}
