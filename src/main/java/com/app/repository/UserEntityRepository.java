package com.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.UserEntity;

public interface UserEntityRepository extends JpaRepository<UserEntity, Integer> {
	
	//1. 이름 검색 조건 (해당 사용자 이름 조회) where user_nm = '고길동'
	public UserEntity findByUserNm(String userNm);
	//2. 이름과 비밀번호 검색 조건 : where user_nm = '고길동' and user_ped = '1234'
	public UserEntity findByUserNmAndUserPwd(String userNm, String userPwd);
	//3. 이름 검색 조건 (비슷한 이름 조건) where user_nm like %홍%
	public List<UserEntity> findByUserNmContaining(String userNm);
}
