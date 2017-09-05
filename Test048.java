//构造器里调用其他构造器
public class Test048 {

	public String name;
	public String color;
	public double weight;

	//2个参数的构造器
	public Test048(String name, String color) {
		this.name = name;
		this.color = color;
	}

	//3个参数的构造器
	public Test048(String name, String color, double weight) {
		//通过this调用另一个重载的构造器的初始化代码
		this(name, color);

		//下面this引用该构造器正在初始化的Java对象
		this.weight = weight;
	}


	public static void main(String[] args) {
		Test048 obj = new Test048("Hello","red", 5.9);
		System.out.println(obj.name);
		System.out.println(obj.color);
		System.out.println(obj.weight);
	}
	

}
