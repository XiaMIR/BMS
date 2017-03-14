package po;

import java.util.Date;

public class User {
	//属性名和数据库的字段一一对应
	private int id ;
	private String name ;//姓名
	private Date birthday ;//出生日期
	private String sex ;//性别
	private String address ;//家庭地址
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthday=" + birthday + ", sex=" + sex + ", address=" + address
				+ "]";
	}

}
