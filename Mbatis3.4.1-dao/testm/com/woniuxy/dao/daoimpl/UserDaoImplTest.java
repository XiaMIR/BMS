package com.woniuxy.dao.daoimpl;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.woniuxy.dao.UserDao;
import com.woniuxy.entity.User;

public class UserDaoImplTest {
	
	private SqlSessionFactory sqlSessionFactory;
	
	//�˷�����ִ��SqlSessionFactory֮ǰִ��
	@Before
	public void setUp() throws Exception {
		//���� SqlSessionFactory
		// mybatis �����ļ�
		String resource = "SqlMapConfig.xml";
		// �õ������ļ���
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// �����Ự����,Ҫ����mybatis�������ļ���Ϣ
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		
	}

	@Test
	public final void testFindUserId()throws Exception {
		//����UserDao�Ķ���
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		//����UserDAO�ķ���
		User user = userDao.findUserId(1);
		System.out.println(user);
		
	}

}
