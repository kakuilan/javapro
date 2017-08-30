//局部变量覆盖成员变量
public class Test042 {
	//定义一个name实例变量
	private String name = "李刚";
	//定义一个price类变量
	private static double price = 78.1;

	public void info() {
		//方法里的局部变量覆盖成员变量
		String name = "孙悟空";
		System.out.println(name);
		System.out.println(this.name);
	}


	public static void main(String[] args) {
		//方法里的局部变量覆盖成员变量
		int price = 65;
		System.out.println(price);
		System.out.println(Test042.price);

		new Test042().info();
	}

}
