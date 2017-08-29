//方法重载
import java.util.Arrays;

public class Test040 {
	//下面定义2个test方法，但方法的形参列表不同
	//系统可以区分这2种方法,这被称为方法重载
	
	public void test() {
		System.out.println("无参数");
	}

	public void test(String msg) {
		System.out.println("重载的test方法" + msg);
	}

	public void test(String... books) {
		System.out.println("形参长度可变的test方法");
		System.out.println(Arrays.deepToString(books));
	}

	public static void main(String[] args) {
		Test040 obj = new Test040();
		obj.test();
		obj.test("Hello World.");
		obj.test("初学java","java入门");
		obj.test(new String[]{"Hello","Java"});
	}

}
