package com.woniuxy.mapper;

import com.woniuxy.entity.User;

/*
 * mapper�ӿ� �൱��dao�ӿ�  �û�����
 */
public interface UserMapper {
	
	/*//����id��ѯ�û���Ϣ
	public User findUserId(int id) throws Exception;
	//��ѯ�û�����
	public List<User> findUserName(String name) throws Exception;
	
	//����û�
	public void insertUser(User user) throws Exception;
	//ɾ���û�
	public void deleteUser(int id) throws Exception;
	*/
	
	//����id��ѯ�û���Ϣ
	public User findById(int id) throws Exception;
	
}
