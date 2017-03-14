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
	// ����id��ѯ�û���Ϣ���õ�һ����¼���
	@Test
	/*
	 * public void findByIdTest() throws IOException{ //mybatis �����ļ� String
	 * resource = "SqlMapConfig.xml"; //�õ������ļ��� InputStream inputStream=
	 * Resources.getResourceAsStream(resource); //�����Ự����,Ҫ���� SqlSessionFactory
	 * sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	 * //ͨ���õ�Sqlsession SqlSession sqlSession = sqlSessionFactory.openSession();
	 * //sqlSession�������ݿ�
	 * //��һ����������ӳ���ļ��е�statement��id������namespace="test"+"."+statement��id
	 * //�ڶ���������ָ����ӳ���ļ�����ƥ���parameterType���͵Ĳ��� //sqlSession.selectOne�����ӳ���ļ�����ƥ���
	 * ResultType���͵Ķ��� //selectOne ��ѯ��һ����¼ User user =
	 * sqlSession.selectOne("test.findById","3"); System.out.println(user);
	 * //�ͷ���Դ sqlSession.close(); }
	 */
	// =====================================================

	// �����û�����ģ����ѯ
	/*
	 * public void findByNameTest() throws IOException { // mybatis �����ļ� String
	 * resource = "SqlMapConfig.xml"; // �õ������ļ��� InputStream inputStream =
	 * Resources.getResourceAsStream(resource); // �����Ự����,Ҫ���� SqlSessionFactory
	 * sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream); //
	 * ͨ���õ�Sqlsession SqlSession sqlSession = sqlSessionFactory.openSession();
	 * // sqlSession�������ݿ� //
	 * ��һ����������ӳ���ļ��е�statement��id������namespace="test"+"."+statement��id //
	 * �ڶ���������ָ����ӳ���ļ�����ƥ���parameterType���͵Ĳ��� // sqlSession.selectOne�����ӳ���ļ�����ƥ���
	 * ResultType���͵Ķ��� // selectList ��ѯ��������¼ // list�е�user��ӳ���ļ��е�resultType
	 * ��ָ������һ�� List<User> list = sqlSession.selectList("test.findByName", "С��");
	 * System.out.println(list); // �ͷ���Դ sqlSession.close(); }
	 */
	// =====================================================

	// ����û���Ϣ
	/*
	 * public void insertUserTest() throws IOException { // mybatis �����ļ� String
	 * resource = "SqlMapConfig.xml"; // �õ������ļ��� InputStream inputStream =
	 * Resources.getResourceAsStream(resource); // �����Ự����,Ҫ����mybatis�������ļ���Ϣ
	 * SqlSessionFactory sqlSessionFactory = new
	 * SqlSessionFactoryBuilder().build(inputStream); // ͨ���õ�Sqlsession
	 * SqlSession sqlSession = sqlSessionFactory.openSession();
	 * 
	 * sqlSession�������ݿ�
	 * ��һ����������ӳ���ļ��е�statement��id������namespace="test"+"."+statement��id
	 * �ڶ���������ָ����ӳ���ļ�����ƥ���parameterType���͵Ĳ��� sqlSession.selectOne�����ӳ���ļ�����ƥ���
	 * ResultType���͵Ķ��� selectList ��ѯ��������¼ list�е�user��ӳ���ļ��е�resultType ��ָ������һ��
	 * 
	 * // �����û����� User user = new User(); user.setName("���");
	 * user.setBirthday(new Date()); user.setSex("Ů"); user.setAddress("��ɽ������");
	 * 
	 * sqlSession.insert("test.insertUser", user); // �ύ���� sqlSession.commit();
	 * //��ȡ�û����� System.out.println(user.getId()); // �رջỰ sqlSession.close(); }
	 */

	// ɾ���û���Ϣ����
	/*
	 * public void deleteUserTest() throws IOException { // mybatis �����ļ� String
	 * resource = "SqlMapConfig.xml"; // �õ������ļ��� InputStream inputStream =
	 * Resources.getResourceAsStream(resource); // �����Ự����,Ҫ����mybatis�������ļ���Ϣ
	 * SqlSessionFactory sqlSessionFactory = new
	 * SqlSessionFactoryBuilder().build(inputStream); // ͨ���õ�Sqlsession
	 * SqlSession sqlSession = sqlSessionFactory.openSession();
	 * 
	 * sqlSession�������ݿ�
	 * ��һ����������ӳ���ļ��е�statement��id������namespace="test"+"."+statement��id
	 * 
	 * // ����idɾ���û� sqlSession.delete("test.deleteUser", 5);//����ɾ���û���id=5 // �ύ����
	 * sqlSession.commit(); // �رջỰ sqlSession.close(); }
	 */

	// �����û���Ϣ
	public void updateUserTest() throws IOException {
		// mybatis �����ļ�
		String resource = "SqlMapConfig.xml";
		// �õ������ļ���
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// �����Ự����,Ҫ����mybatis�������ļ���Ϣ
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// ͨ���õ�Sqlsession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		/*
		 * sqlSession�������ݿ�
		 * ��һ����������ӳ���ļ��е�statement��id������namespace="test"+"."+statement��id
		 * �ڶ���������ָ����ӳ���ļ�����ƥ���parameterType���͵Ĳ��� sqlSession.selectOne�����ӳ���ļ�����ƥ���
		 */
		// �����û�����Ϣ
		User user = new User();
		user.setId(4);// ���µ��� id=4���û���Ϣ
		user.setName("��er��");
		user.setBirthday(new Date());
		user.setSex("����");
		user.setAddress("̩��");

		sqlSession.update("test.updateUser", user);
		// �ύ����
		sqlSession.commit();
		// �رջỰ
		sqlSession.close();
	}
}
