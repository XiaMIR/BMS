package com.woniuxy.mapper;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.woniuxy.entity.User;

public class UserMapperTest {
	
	private SqlSessionFactory sqlSessionFactory;

	@Before
	public void setUp() throws Exception {
		String resource = "SqlMapConfig.xml";
		// �õ������ļ���
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// �����Ự����,Ҫ����mybatis�������ļ���Ϣ
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
	}

	@Test
	public final void testFindById() throws Exception {
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//����UserDao����,mybatis�Զ�����mapper�������
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		//����userMapper�ķ���
		User user = userMapper.findById(3);
		System.out.println(user);
		
		
	}

}
