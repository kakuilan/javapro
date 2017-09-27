//Lambda与匿名内部类类似
@FunctionalInterface
interface Displayable {
	//定义一个抽象方法和默认方法
	void display();
	default int add(int a,int b) {
		return a+b;
	}
}

class LambdaAndInner {
	private int age = 12;
	private static String name = "疯狂软件教育中心";

	public void test(){
		String book = "疯狂Java讲义";
		Displayable dis = ()-> {
			//访问effectively final的局部变量
			System.out.println("book局部变量为："+book);
			//访问外部类的实例变量和类变量
			System.out.println("外部类的age实例变量为："+age);
			System.out.println("外部类的name类变量为："+name);
		};

		dis.display();
		//调用dis对象从接口中继承的add方法
		System.out.println(dis.add(3,5));
	}
}

public class Test091 {
	public static void main(String[] args) {
		LambdaAndInner lambda = new LambdaAndInner();
		lambda.test();
	}
}
