//调用父类构造器
class Base{
	public double size;
	public String name;
	public Base(double size, String name) {
		this.size = size;
		this.name = name;
	}
}

public class Test053 extends Base {
	public String color;
	public Test053(double size, String name, String color) {
		//通过super调用父类构造器
		super(size, name);
		this.color = color;
	}

	public static void main(String[] args) {
		Test053 obj = new Test053(5.6, "测试对象", "red");
		System.out.println(obj.size+"--"+obj.name+"--"+obj.color);
	}
}
