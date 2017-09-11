//包装类和数值变量的比较
public class Test064 {
	
	public static void main(String[] args) {
		String intStr = 5+"";

		Integer a = new Integer(6);
		System.out.println("6的包装类实例是否大于5.0 :"+ (a>5.0));
	

		//2个包装类实例的比较,返回false
		System.out.println("比较2个包装类的实例是否相等:"+ (new Integer(2)==new Integer(2)));

		//通过自动装箱，允许把基本类型值赋给包装类实例
		Integer ina = 2;
		Integer inb = 2;
		System.out.println("2个自动装箱是否相等:"+ (ina==inb)); //true

		Integer biga = 128;
		Integer bigb = 128;
		System.out.println("2个128自动装箱后是否相等:"+(biga==bigb)); //false

	}

}
