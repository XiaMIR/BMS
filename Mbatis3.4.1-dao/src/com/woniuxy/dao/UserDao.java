package com.woniuxy.dao;

import java.util.List;

import com.woniuxy.entity.User;

/*
 * dao�ӿ�
 */
public interface UserDao {
	
	//����id��ѯ�û���Ϣ
	public User findUserId(int id) throws Exception;
	//��ѯ�û�����
	public List<User> findUserName(String name) throws Exception;
	
	//����û�
	public void insertUser(User user) throws Exception;
	//ɾ���û�
	public void deleteUser(int id) throws Exception;
	
	
	
}
