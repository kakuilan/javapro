//this和局部变量
public class Test035 {

	//定义一个foo的成员变量
	public int foo;

	//定义构造器
	public Test035() {
		//构造器里面定义一个foo局部变量
		int foo = 0;

		//使用this代表该构造器正在初始化的对象
		//下面的代码将会把初始化对象的foo成员变量设为6
		this.foo = 6;

		//局部变量设为1
		foo = 1; 
		System.out.println(foo);
		System.out.println(this.foo);
	}


	public static void main(String[] args) {
		System.out.println(new Test035().foo);
	}


}
