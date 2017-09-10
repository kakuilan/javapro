//instanceof运算符
public class Test057 {
	public static void main(String[] args) {
		//声明hello时使用Object类，则hello的编译时类型是Object
		//Object是所有类的父类，但hello变量的实际类型/运行时类型是String
		Object hello = "Hello";

		//String与Object存在继承关系，可进行instanceof运算
		System.out.println("字符串是否Object的实例："+ (hello instanceof Object));
		System.out.println("字符串是否Object的实例："+ (hello instanceof String));

		//Math与Object存在继承关系，可进行instanceof运算
		System.out.println("字符串是否Math类的实例："+ (hello instanceof Math));

		//String实现了Comparable接口
		System.out.println("字符串是否Comparable接口的实例:"+ (hello instanceof Comparable));

		String a = "Hello";
		//String类与Math类没有继承关系，所以下面代码编译错误
		//System.out.println("字符串是否Math类的实例："+(a instanceof Math));
	}

}
