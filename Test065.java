//==和equals方法
public class Test065 {
	public static void main(String[] args) {
		int it = 65;
		float fl = 65.0f;
		System.out.println("65和65.0f是否相等?" + (it==fl)); //true

		char ch = 'A';
		System.out.println("65和'A'是否相等?" + (it==ch)); //true

		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println("str1和str2是否相等?" + (str1==str2)); //false
		System.out.println("str1是否equals str2?"+ (str1.equals(str2))); //true

		//由于java.lang.String与Test065类没有继承关系
		//下面语句将导致编译错误
		//System.out.println("hello"== new Test965());

	}
}
