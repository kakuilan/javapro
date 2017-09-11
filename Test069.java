//final修饰成员变量
public class Test069 {

	//调用成员变量时指定默认值,合法
	final int a = 6;
	//下面变量将在构造器或初始化块中分配初始值
	final String str;
	final int c;
	final static double d;

	//既没有指定默认值，又没有在初始化块、构造器中指定初始值
	//下面定义的ch实例变量是不合法的
	//final char ch;
	
	//初始化块，可对没有指定默认值的实例变量指定初始值
	{
		//在初始化块中为实例变量指定初始值，合法
		str = "Hello";

		//定义a实例变量时已经指定了默认值
		//不能再为a重新赋值，下面的语句非法
		//a=9;
	}

	//静态初始化块，可对没有指定默认值的类变量指定初始值
	static {
		d = 5.6;
	}

	//构造器，可对既没有指定默认值，又没有在初始化块中指定初始值的实例变量指定初始值
	public Test069(){
		//因为已经在初始化块中指定了str的初始值，下面语句非法
		//str = "java";
		c = 5;
	}

	public void changeFinal(){
		//普通非法不能为final修饰的成员变量赋值
		//d=1.2;
	}

	public static void main(String[] args) {
		Test069 ft = new Test069();
		System.out.println(ft.a);
		System.out.println(ft.c);
		System.out.println(ft.d);
	}


}
