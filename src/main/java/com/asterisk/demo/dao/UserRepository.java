package com.asterisk.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.asterisk.demo.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	User findByUserNameAndPassword(String un,String psw);
	
	@Query(value="select * from user where user_name=:un and password= :psw",nativeQuery=true)
	User login(@Param("un")String un,@Param("psw")String psw);
}
