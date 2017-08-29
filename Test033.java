public class Test033 {
	//定义了2个成员变量
	public String name;
	public int age;

	//定义了一个say方法
	public void say(String content) {
		System.out.println(content);
	}

	//本类没有定义构造器,系统将为它提供默认构造器
	
	public static void main(String[] args) {
		//使用Test033类定义一个p变量
		Test033 p;
		p = new Test033();
		p.name = "李刚";
		p.say("java,你好!");
		System.out.println(p.name);
		
	}


}
