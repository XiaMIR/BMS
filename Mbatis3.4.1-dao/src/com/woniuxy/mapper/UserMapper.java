package com.woniuxy.mapper;

import com.woniuxy.entity.User;

/*
 * mapper接口 相当于dao接口  用户管理
 */
public interface UserMapper {
	
	/*//根据id查询用户信息
	public User findUserId(int id) throws Exception;
	//查询用户名字
	public List<User> findUserName(String name) throws Exception;
	
	//添加用户
	public void insertUser(User user) throws Exception;
	//删除用户
	public void deleteUser(int id) throws Exception;
	*/
	
	//根据id查询用户信息
	public User findById(int id) throws Exception;
	
}
