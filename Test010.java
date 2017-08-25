//表达式类型自动提升的正确示例
public class Test010 {
	public static void main(String[] args) {
		byte b = 40;
		char c = 'a';
		int i = 23;
		double d = .314;
		//右边表达式中最高等级操作数为d(double类型)
		//则右边表达式的类型为double,故赋值给一个double类型变量
		double result = b + c + i *d;
		System.out.println(result);

		//表达式的类型将严格保持和表达式中最高等级操作数相同的类型
		int val = 3;
		//右边表达式中2个操作数都是int,故右边表达式的类型为int
		//虽然23/3不能除尽,但依然得到一个int类型整数
		int intResult = 23 /val;
		System.out.println(intResult);
	
	}

}
