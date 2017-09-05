//继承
class Fruit {
	public double weight;
	public void info() {
		System.out.println("我是一个水果，重量:"+weight+" g");
	}
}

public class Test049 extends Fruit {
	public static void main(String[] args) {
		Test049 obj = new Test049();
		obj.weight = 34;
		obj.info();
	}
}
