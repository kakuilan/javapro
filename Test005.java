//自动类型转换
public class Test005 {

	public static void main(String[] args) {
		int a = 6;
		//int类型可自动转换为float类型
		float f = a;
		System.out.println(f);
		//定义一个byte类型的整数变量
		byte b = 9;
		//下面代码将出错,byte不能自动转换为char类型
		// char c = b;
		//byte类型可自动转换为double类型
		double d = b;
		System.out.println(d);
	}
}
