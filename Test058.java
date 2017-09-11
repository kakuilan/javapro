//尽量不要在父类构造器中调用将要被子类重写的方法
class Base {
	public Base(){
		test();
	}

	public void test(){
		System.out.println("将被子类重写的方法覆盖");
	}
}

public class Test058 extends Base {
	private String name;

	public void test(){
		System.out.println("子类重写父类的方法，其name字符串长度;"+name.length());
	}

	public static void main(String[] args) {
		//下面代码将会引发指针异常
		//因为父类构造器调用了被子类重写的test()方法，此时对象的name实例变量是null
		Test058 s = new Test058();
	}


}
