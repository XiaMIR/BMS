package com.woniuxy.dao;

import java.util.List;

import com.woniuxy.entity.User;

/*
 * dao接口
 */
public interface UserDao {
	
	//根据id查询用户信息
	public User findUserId(int id) throws Exception;
	//查询用户名字
	public List<User> findUserName(String name) throws Exception;
	
	//添加用户
	public void insertUser(User user) throws Exception;
	//删除用户
	public void deleteUser(int id) throws Exception;
	
	
	
}
