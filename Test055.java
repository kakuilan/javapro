//多态性
class BaseClass {
	public int book = 6;
	public void base(){
		System.out.println("父类的普通方法");
	}

	public void test(){
		System.out.println("父类的被覆盖的方法");
	}
}

public class Test055 extends BaseClass {
	//重新定义一个book实例变量隐藏父类的book实例变量
	public String book = "轻量级Java实战";

	public void test(){
		System.out.println("子类的覆盖父类的方法");
	}

	public void sub(){
		System.out.println("子类的普通方法");
	}

	public static void main(String[] args) {
		//下面编译时类型和运行时类型完全一样，因此不存在多态
		BaseClass bc = new BaseClass();
		System.out.println(bc.book);

		//下面2次调用将执行BaseClass的方法
		bc.base();
		bc.test();

		//下面编译时类型和运行时类型完全一样，因此不存在多态
		Test055 sc = new Test055();
		System.out.println(sc.book);
		sc.base();
		sc.test();

		//下面编译时类型和运行时类型不一样，多态发生
		BaseClass ploymophicBc = new Test055();
		//将输出6，表明访问的是父类对象的实例变量
		System.out.println(ploymophicBc.book);
		//下面调用将执行从父类继承的base方法
		ploymophicBc.base();
		//下面调用将执行当前类的test方法
		ploymophicBc.test();

		//因为ploymophicBc的编译时类型是BaseClass
		//BaseClass类没有提供sub()方法，下面代码编译时将出错
		//ploymophicBc.sub();
	}
}
