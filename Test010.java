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
	
	}

}
