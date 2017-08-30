//实例变量和局部变量
class Person {
	//定义一个实例变量
	public String name;

	//定义一个类变量
	public static int eyeNum;

}

public class Test041 {
	public static void main(String[] args) {
		//第一次主动使用Person类,该类自动初始化,则eyeNum变量开始起作用
		System.out.println("Person的eyeNum类变量值:"+ Person.eyeNum);
		//创建Person对象
		Person p = new Person();
		//通过Person对象的引用p来访问Person对象name实例变量
		//并通过实例访问eyeNum类变量
		System.out.println("p对象的name值是:"+p.name+" eyeNum值是:"+p.eyeNum);

		//直接为name实例变量赋值
		p.name = "孙悟空";
		p.eyeNum = 2;

		//再次通过Person对象来访问name实例变量和eyeNum类变量
		System.out.println("p对象的name值是:"+p.name+" eyeNum值是:"+p.eyeNum);

		//前面通过p修改了Person的eyeNum,此处的Person.eyeNum将输出2
		System.out.println("Person的eyeNum类变量值:"+Person.eyeNum);

		Person p2 = new Person();
		//p2访问的eyeNum类变量依然引用Person类的,因此依然输出2
		System.out.println("p2对象的eyeNum类变量值:" + p2.eyeNum);

	}

}
