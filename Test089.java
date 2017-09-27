//Lambda引用某类对象的实例方法
@FunctionalInterface
interface MyTest {
	String test(String a, int b, int c);
}

public class Test089 {
	public static void main(String[] args) {
		//下面代码使用Lambda表达式创建MyTest对象
		MyTest mt = (a,b,c) -> a.substring(b,c);
		String str = mt.test("Java I love you", 2, 9);
		System.out.println(str);
	}
}
