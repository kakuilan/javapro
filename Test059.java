//类的组合
class Animal {
	private void beat(){
		System.out.println("心脏跳动...");
	}

	public void breath(){
		beat();
		System.out.println("吸一口气，吐一口气，呼吸中...");
	}
}

class Bird {
	//将父类组合到子类，作为子类的组合成分
	private Animal a;

	public Bird(Animal a) {
		this.a = a;
	}

	//重新定义一个自己的breath()方法
	public void breath(){
		//直接复用Animal提供的breath()来实现Bird的breath()方法
		a.breath();
	}

	public void fly(){
		System.out.println("我在天空自由飞翔...");
	}
}

class Wolf {
	//组合
	private Animal a;

	public Wolf(Animal a) {
		this.a = a;
	}

	public void breath(){
		a.breath();
	}

	public void run(){
		System.out.println("我在陆地上快速奔跑...");
	}
}

public class Test059 {
	public static void main(String[] args) {
		//显式创建被组合的对象
		Animal a1 = new Animal();
		Bird b = new Bird(a1);
		b.breath();
		b.fly();

		Animal a2 = new Animal();
		Wolf w = new Wolf(a2);
		w.breath();
		w.run();

	}
}



