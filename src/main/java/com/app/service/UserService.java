package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.UserEntity;
import com.app.repository.UserEntityRepository;

@Service
public class UserService {

	@Autowired
	private UserEntityRepository uER;
	
	public UserEntity findByUserNm() {
		return uER.findByUserNm("고길동");
	}
	
	public UserEntity findByUserNmAndUserPwd() {
		
		return uER.findByUserNmAndUserPwd("고길동", "1234");
	}
	
	public List<UserEntity> findByUserNmContaining(){
		return uER.findByUserNmContaining("길동");
	}
	
}
