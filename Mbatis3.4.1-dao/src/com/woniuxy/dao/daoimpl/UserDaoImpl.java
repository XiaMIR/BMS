package com.woniuxy.dao.daoimpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.woniuxy.dao.UserDao;
import com.woniuxy.entity.User;

/*
 * dao的实现类 没有经过任何整合的例子
 */

public class UserDaoImpl implements UserDao{
	
	/*
	 * 向Dao实现类注入SqlsessionFactory
	 * 通过构造方法注入
	 */
	private SqlSessionFactory sessionFactory;
	
	public UserDaoImpl(SqlSessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}

	@Override
	public User findUserId(int id) throws Exception {
		SqlSession sqlSession = sessionFactory.openSession();
		User user = sqlSession.selectOne("test.findByName", id);
		//释放资源
		sqlSession.close();
		return user	;
		 
	}
	//添加信息
	@Override
	public void insertUser(User user) throws Exception {
		SqlSession sqlSession = sessionFactory.openSession();
		//执行插入操作
		sqlSession.insert("test.insertUser", user); 
		//提交事务
		sqlSession.commit();
		//释放资源
		sqlSession.close();
	}
	//删除信息
	@Override
	public void deleteUser(int id) throws Exception {
		SqlSession sqlSession = sessionFactory.openSession();
		//执行插入操作
		sqlSession.delete("test.deleteUser", id);
		//提交事务
		sqlSession.commit();
		//释放资源
		sqlSession.close();
		
	}

	@Override
	public List<User> findUserName(String name) throws Exception {
		SqlSession sqlSession = sessionFactory.openSession();
		List<User> list = sqlSession.selectList("test.findByName", name);
		
		return list;
	}


}
