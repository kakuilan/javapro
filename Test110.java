//自定义类实现克隆
class Address {
	String detail;
	public Address(String detail) {
		this.detail = detail;
	}
}

//实现Cloneable接口
class User implements Cloneable {
	int age;
	Address address;

	public User(int age) {
		this.age = age;
		address = new Address("深圳南山");
	}

	//通过调用super.clone()实现clone()方法
	public User clone() throws CloneNotSupportedException {
		return (User)super.clone();
	}
}

public class Test110 {
	public static void main(String[] args) throws CloneNotSupportedException {
		User u1 = new User(29);
		//clone得到u1的副本
		User u2 = u1.clone();
		//判断u1,u2是否相同
		System.out.println(u1 == u2);
		//判断u1,u2的address是否相同
		System.out.println(u1.address == u2.address);
	}
}

