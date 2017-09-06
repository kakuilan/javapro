//重写父类的方法
class Bird{
	public void fly(){
		System.out.println("我在天空里自由飞翔...");
	}
}

public class Test050 extends Bird{
	//重写Bird类的fly方法
	public void fly(){
		System.out.println("我只能在地上奔跑...");
	}


	public static void main(String[] args) {
		Test050 obj = new Test050();
		obj.fly();
	}
}
