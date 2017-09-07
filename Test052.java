//super限定的特殊情形
class Parent{
	public String tag = "疯狂Java讲义";
}

class Derived extends Parent {
	//定义一个私有的tag实例变量来隐藏父类的tag实例变量
	private String tag = "轻量级JavaEE企业实战";
}

public class Test052 {
	public static void main(String[] args) {
		Derived d = new Derived();
		//程序不可访问d的私有变量tag,下面语句将引起编译错误
		//System.out.println(d.tag);
		//将d变量显式地向上转型为Parent后，即可访问tag实例变量
		System.out.println(((Parent)d).tag);
	}
}
