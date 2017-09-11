//实例访问类成员
public class Test067 {

	private static void test(){
		System.out.println("static修饰的类方法");
	}

	public static void main(String[] args) {
		//定义一个Test067变量，值为null
		Test067 nas = null;
		//使用null对象调用所属类的静态方法
		nas.test();
	}
}
