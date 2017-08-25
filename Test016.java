//数学运算Math类
public class Test016 {
	public static void main(String[] args) {
		double a = 3.2; //定义变量a位3.2
		//求a的5次方
		double b = Math.pow(a, 5);
		//求a的平方根
		double c = Math.sqrt(a);
		//计算随机数,返回0~1之间的伪随机数
		double d = Math.random();
		//求1.57的sin函数值
		double e = Math.sin(1.57);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

	}
}
