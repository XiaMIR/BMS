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
	
	//此方法在执行SqlSessionFactory之前执行
	@Before
	public void setUp() throws Exception {
		//创建 SqlSessionFactory
		// mybatis 配置文件
		String resource = "SqlMapConfig.xml";
		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 创建会话工厂,要传入mybatis的配置文件信息
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		
	}

	@Test
	public final void testFindUserId()throws Exception {
		//创建UserDao的对象
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		//调用UserDAO的方法
		User user = userDao.findUserId(1);
		System.out.println(user);
		
	}

}
