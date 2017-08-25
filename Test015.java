//自增自减
public class Test015 {

	public static void main(String[] args) {
		int a = 5;
		//让a先执行运算然后自增
		int b = a++ + 6;
		System.out.println(a+"\n"+b);

		int c = 5;
		//让b先自增再执行运算
		int d = ++c + 6;
		System.out.println(c+"\n"+d);
	
	}
}
