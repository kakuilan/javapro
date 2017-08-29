//形参个数可变
public class Test038 {
	//定义了形参个可变的方法
	public static void test(int a, String... books) {
		//books被当成数组
		for (String book : books) {
			System.out.println(book);
		}
	
		System.out.println(a);
	}

	public static void main(String[] args) {
		test(5, "疯狂java","java从入门到放弃");
	}

}
