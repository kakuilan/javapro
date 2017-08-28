//只要类型相互兼容,就可让一个数组变量指向另一个实际的数组,这种操作会让人产生数组长度可变的错觉.
public class Test026 {
	public static void main(String[] args) {
		//定义并初始化数组,使用静态初始化
		int[] a = {5, 7, 20};
		//定义并初始化数组,使用动态初始化
		int[] b = new int[4];
		System.out.println("b数组的长度为:"+b.length);
		for (int i=0,len = a.length;i<len;i++) {
			System.out.println(a[i]);
		}
		for (int i=0,len = b.length;i<len;i++) {
			System.out.println(b[i]);
		}
		//因为a和b都是int[]类型,所有可将a的值赋给b
		//也就是让b引用指向a引用指向的数组
		b = a;
		System.out.println("b数组的长度为:"+ b.length);
	}
}
