//重写父类的方法
class Bird{
	public void fly(){
		System.out.println("我在天空里自由飞翔...");
	}

	//test方法是private方法权限，子类不可访问该方法
	private void test(){
		
	}

}

public class Test050 extends Bird{
	//重写Bird类的fly方法
	public void fly(){
		System.out.println("我只能在地上奔跑...");
	}

	//此处并不是方法重写，所以可以增加static关键字
	public static void test(){
	
	}


	public static void main(String[] args) {
		Test050 obj = new Test050();
		obj.fly();
	}
}
