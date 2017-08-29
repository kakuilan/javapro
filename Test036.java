//类方法的值传递
public class Test036 {
	public static void swap(int a,int b) {
		//下面代码将实现a/b变量的值交换
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("swap方法里,a的值是:"+a+" b的值是:"+b);
	}

	public static void main(String[] args) {
		int a = 6;
		int b = 9;
		swap(a, b);
		System.out.println("交换结束后,a的值是:"+a+" b的值是:"+b);
	}
}
