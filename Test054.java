//子类和父类构造器的调用顺序
class Creature {
	public Creature(){
		System.out.println("Creature无参数的构造器");
	}
}

class Animal extends Creature {
	public Animal(String name) {
		System.out.println("Animal带一个参数的构造器，该动物的name为"+name);
	}

	public Animal(String name, int age) {
		//使用this调用同一个重载的构造器
		this(name);
		System.out.println("Animal带2个参数的构造器，其age为"+age);
	}
}

public class Test054 extends Animal {
	public Test054(){
		//显式调用父类有2个参数的构造器
		super("葫芦娃", 7);
		System.out.println("Test054无参数的构造器");
	}

	public static void main(String[] args) {
		new Test054();
	}

}
