//逻辑运算,短路
public class Test019 {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		//对a>4 和 b++>10 求或运算
		if (a>4 | b++>10) {
			System.out.println("a的值是:"+a+",b的值是:"+b);
		}

		int c = 5;
		int d = 10;
		// ||会短路,前面为真时不再计算右边的
		if (c>4 || d++ >10) {
			System.out.println("c的值是:"+c+",d的值是:"+d);
		}
	
	}

}
