package com.woniuxy.dao.daoimpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.woniuxy.dao.UserDao;
import com.woniuxy.entity.User;

/*
 * dao��ʵ���� û�о����κ����ϵ�����
 */

public class UserDaoImpl implements UserDao{
	
	/*
	 * ��Daoʵ����ע��SqlsessionFactory
	 * ͨ�����췽��ע��
	 */
	private SqlSessionFactory sessionFactory;
	
	public UserDaoImpl(SqlSessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}

	@Override
	public User findUserId(int id) throws Exception {
		SqlSession sqlSession = sessionFactory.openSession();
		User user = sqlSession.selectOne("test.findByName", id);
		//�ͷ���Դ
		sqlSession.close();
		return user	;
		 
	}
	//�����Ϣ
	@Override
	public void insertUser(User user) throws Exception {
		SqlSession sqlSession = sessionFactory.openSession();
		//ִ�в������
		sqlSession.insert("test.insertUser", user); 
		//�ύ����
		sqlSession.commit();
		//�ͷ���Դ
		sqlSession.close();
	}
	//ɾ����Ϣ
	@Override
	public void deleteUser(int id) throws Exception {
		SqlSession sqlSession = sessionFactory.openSession();
		//ִ�в������
		sqlSession.delete("test.deleteUser", id);
		//�ύ����
		sqlSession.commit();
		//�ͷ���Դ
		sqlSession.close();
		
	}

	@Override
	public List<User> findUserName(String name) throws Exception {
		SqlSession sqlSession = sessionFactory.openSession();
		List<User> list = sqlSession.selectList("test.findByName", name);
		
		return list;
	}


}
