//构造器重载
public class Test047 {
	public String name;
	public int count;

	//提供无参数的构造器
	public Test047() {
		
	}

	//提供带2个参数的构造器
	//对该构造器返回的对象执行初始化
	public Test047(String name, int count){
		this.name = name;
		this.count = count;
	}

	public static void main(String[] args) {
		Test047 obj1 = new Test047();
		Test047 obj2 = new Test047("java入门", 300);
		System.out.println(obj1.name + " " +obj1.count );
		System.out.println(obj2.name + " " +obj2.count );
	}

}
