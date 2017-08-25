//强制类型转换
public class Test007{
	public static void main(String[] args) {
		int iVal = 233;
		//强制把一个int类型的值转换为byte类型的值
		byte bVal = (byte)iVal;
		//数据丢失,将输出-23
		System.out.println(bVal);
		double dVal = 3.98;
		//强制把一个double转换为int
		int tol = (int)dVal;
		//将输出3
		System.out.println(tol);
	}
}
