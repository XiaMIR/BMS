package mb;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import po.User;

public class MbatisF {
	// 根据id查询用户信息，得到一条记录结果
	@Test
	/*
	 * public void findByIdTest() throws IOException{ //mybatis 配置文件 String
	 * resource = "SqlMapConfig.xml"; //得到配置文件流 InputStream inputStream=
	 * Resources.getResourceAsStream(resource); //创建会话工厂,要传入 SqlSessionFactory
	 * sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	 * //通过得到Sqlsession SqlSession sqlSession = sqlSessionFactory.openSession();
	 * //sqlSession操作数据库
	 * //第一个参数就是映射文件中的statement的id，等于namespace="test"+"."+statement的id
	 * //第二个参数：指定和映射文件中所匹配的parameterType类型的参数 //sqlSession.selectOne结果与映射文件中所匹配的
	 * ResultType类型的对象 //selectOne 查询出一条记录 User user =
	 * sqlSession.selectOne("test.findById","3"); System.out.println(user);
	 * //释放资源 sqlSession.close(); }
	 */
	// =====================================================

	// 更具用户名称模糊查询
	/*
	 * public void findByNameTest() throws IOException { // mybatis 配置文件 String
	 * resource = "SqlMapConfig.xml"; // 得到配置文件流 InputStream inputStream =
	 * Resources.getResourceAsStream(resource); // 创建会话工厂,要传入 SqlSessionFactory
	 * sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream); //
	 * 通过得到Sqlsession SqlSession sqlSession = sqlSessionFactory.openSession();
	 * // sqlSession操作数据库 //
	 * 第一个参数就是映射文件中的statement的id，等于namespace="test"+"."+statement的id //
	 * 第二个参数：指定和映射文件中所匹配的parameterType类型的参数 // sqlSession.selectOne结果与映射文件中所匹配的
	 * ResultType类型的对象 // selectList 查询出多条记录 // list中的user和映射文件中的resultType
	 * 所指的类型一致 List<User> list = sqlSession.selectList("test.findByName", "小明");
	 * System.out.println(list); // 释放资源 sqlSession.close(); }
	 */
	// =====================================================

	// 添加用户信息
	/*
	 * public void insertUserTest() throws IOException { // mybatis 配置文件 String
	 * resource = "SqlMapConfig.xml"; // 得到配置文件流 InputStream inputStream =
	 * Resources.getResourceAsStream(resource); // 创建会话工厂,要传入mybatis的配置文件信息
	 * SqlSessionFactory sqlSessionFactory = new
	 * SqlSessionFactoryBuilder().build(inputStream); // 通过得到Sqlsession
	 * SqlSession sqlSession = sqlSessionFactory.openSession();
	 * 
	 * sqlSession操作数据库
	 * 第一个参数就是映射文件中的statement的id，等于namespace="test"+"."+statement的id
	 * 第二个参数：指定和映射文件中所匹配的parameterType类型的参数 sqlSession.selectOne结果与映射文件中所匹配的
	 * ResultType类型的对象 selectList 查询出多条记录 list中的user和映射文件中的resultType 所指的类型一致
	 * 
	 * // 插入用户对象 User user = new User(); user.setName("李狗蛋");
	 * user.setBirthday(new Date()); user.setSex("女"); user.setAddress("那山沟沟里");
	 * 
	 * sqlSession.insert("test.insertUser", user); // 提交事务 sqlSession.commit();
	 * //获取用户主键 System.out.println(user.getId()); // 关闭会话 sqlSession.close(); }
	 */

	// 删除用户信息测试
	/*
	 * public void deleteUserTest() throws IOException { // mybatis 配置文件 String
	 * resource = "SqlMapConfig.xml"; // 得到配置文件流 InputStream inputStream =
	 * Resources.getResourceAsStream(resource); // 创建会话工厂,要传入mybatis的配置文件信息
	 * SqlSessionFactory sqlSessionFactory = new
	 * SqlSessionFactoryBuilder().build(inputStream); // 通过得到Sqlsession
	 * SqlSession sqlSession = sqlSessionFactory.openSession();
	 * 
	 * sqlSession操作数据库
	 * 第一个参数就是映射文件中的statement的id，等于namespace="test"+"."+statement的id
	 * 
	 * // 根据id删除用户 sqlSession.delete("test.deleteUser", 5);//传入删出用户的id=5 // 提交事务
	 * sqlSession.commit(); // 关闭会话 sqlSession.close(); }
	 */

	// 更新用户信息
	public void updateUserTest() throws IOException {
		// mybatis 配置文件
		String resource = "SqlMapConfig.xml";
		// 得到配置文件流
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 创建会话工厂,要传入mybatis的配置文件信息
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 通过得到Sqlsession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		/*
		 * sqlSession操作数据库
		 * 第一个参数就是映射文件中的statement的id，等于namespace="test"+"."+statement的id
		 * 第二个参数：指定和映射文件中所匹配的parameterType类型的参数 sqlSession.selectOne结果与映射文件中所匹配的
		 */
		// 更新用户的信息
		User user = new User();
		user.setId(4);// 更新的是 id=4的用户信息
		user.setName("蛋er蛋");
		user.setBirthday(new Date());
		user.setSex("人妖");
		user.setAddress("泰国");

		sqlSession.update("test.updateUser", user);
		// 提交事务
		sqlSession.commit();
		// 关闭会话
		sqlSession.close();
	}
}
