//%求余运算
public class Test014 {
	public static void main(String[] args) {
		double a = 5.2;
		double b = 3.1;
		double mod = a % b;
		System.out.println(mod); //mod值位2.1

		System.out.println("5对0.0求余的结果是:"+ 5%0.0); //输出非数NaN
		System.out.println("-5对0.0求余的结果是:"+ -5%0.0); //输出非数NaN
		System.out.println("0对5.0求余的结果是:"+ 0%5.0); //输出0.0
		System.out.println("0对0.0求余的结果是:"+ 0%0.0); //输出非数NaN
		System.out.println("-5对0求余的结果是:"+ -5%0); //异常

	
	}

}
