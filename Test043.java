//类成员的访问控制
class Person {
	//使用private修饰成员变量,将这些成员变量隐藏起来
	private String name;
	private int age;

	//提供方法来操作name成员变量
	public void setName(String name) {
		//执行合理性校验
		if(name.length()>6 || name.length()<2) {
			System.out.println("您设置的人名不符合要求");
			return;
		}else{
			this.name = name;
		}
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		if(age>100 || age<0) {
			System.out.println("您设置的年龄不合法");
			return;
		}else{
			this.age = age;
		}
	}

	public int getAge(){
		return this.age;
	}

}



public class Test043 {
	public static void main(String[] args) {
		Person p = new Person();
		//因为age成员变量已被隐藏,所以下面语句将出现编译错误
		//p.age = 100;

		//程序不会修改p的age成员变量,因为合法性校验
		p.setAge(1000);
		System.out.println("未能设置age成员变量:" + p.getAge());

		//成功修改p的age成员变量
		p.setAge(39);
		System.out.println("成功设置age成员变量:" + p.getAge());

		p.setName("李刚");
		System.out.println("成功设置name成员变量:" + p.getName());




	}

}
