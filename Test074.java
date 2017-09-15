//接口
interface Output {
	//接口里定义的成员变量只能是常量
	int MAX_CACHE_LINE = 50;
	//接口里定义的普通方法只能是public的抽象方法
	void out();
	void getData(String msg);

	//在接口中定义默认方法,需要使用default修饰
	default void print(String ...msgs) {
		for(String msg : msgs) {
			System.out.println(msg);
		}
	}

	//在接口中定义默认方法,需要使用default修饰
	default void test(){
		System.out.println("默认的test()方法");
	}

	//在接口中定义类方法,需要使用static修饰
	static String staticTest(){
		return "接口里的类方法";
	}
}

public class Test074{
	public static void main(String[] args) {
		//访问Output接口的MAX_CACHE_LINE
		System.out.println(Output.MAX_CACHE_LINE);
		//使用接口来调用类方法
		System.out.println(Output.staticTest());
	}
}
