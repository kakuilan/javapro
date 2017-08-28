//引用类型数组的初始化
//首先定义一个Person类
class Person {
	public int age;
	public double height;
	public void info() {
		System.out.println("我的年龄是:"+age + ",我的身高是:"+height);
	}
}

public class Test027 {

	public static void main(String[] args) {
		//定义一个students数组变量,其类型是Person[]
		Person[] students;
		//指向动态初始化
		students = new Person[2];
		//创建一个Person实例,并将该实例赋给zhang变量
		Person zhang = new Person();
		//为zhang所引用的Person对象的age,height赋值
		zhang.age = 15;
		zhang.height = 158;

		Person lee = new Person();
		lee.age = 16;
		lee.height = 161;

		students[0] = zhang;
		students[1] = lee;

		lee.info();
		students[1].info();

	}
}
