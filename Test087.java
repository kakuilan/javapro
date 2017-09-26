//Lambda表达式几种简化写法
interface Eatable{
	void taste();
}

interface Flyable{
	void fly(String weather);
}

interface Addable {
	int add(int a,int b);
}

public class Test087 {

	//调用该方法需要Eatable对象
	public void eat(Eatable e) {
		System.out.println(e);
		e.taste();
	}

	//调用该方法需要Flyable对象
	public void drive(Flyable f) {
		System.out.println("我正在驾驶："+f);
		f.fly("晴川历历汉阳树");
	}

	//调用该方法需要Addable对象
	public void test(Addable add) {
		System.out.println("5和3的和为："+add.add(5,3));
	}

	public static void main(String[] args) {
		Test087 lq = new Test087();
		
		//Lambda表达式的代码块只有一条语句，可省略花括号
		lq.eat(()-> System.out.println("苹果的味道不错"));

		//Lambda表达式的形参列表只有一个形参，可省略圆括号
		lq.drive(weather -> {
			System.out.println("今天天气是："+weather);
			System.out.println("直升机飞行平稳");
		});

		//Lambda表达式的代码块只有一条语句，可省略花括号
		//代码块中只有一条语句，即使该表达式需要返回值，也可省略return关键字
		lq.test((a,b)-> a+b );

	}


}
