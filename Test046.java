//使用构造器进行初始化
public class Test046 {

	public String name;
	public int count;

	//自定义的构造器
	public Test046 (String name,int count) {
		this.name = name;
		this.count = count;
	}

	public static void main(String[] args) {
		//使用自定义的构造器创建对象
		//系统将会对该对象指向自定义的初始化
		Test046 tc = new Test046("疯狂Java", 9000);
		System.out.println(tc.name);
		System.out.println(tc.count);

	}

}
