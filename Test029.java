//Arrays类
import java.util.Arrays;

public class Test029 {
	public static void main(String[] args) {
		int[] a = new int[]{3,4,5,6};
		int[] a2 = new int[]{3,4,5,6};

		System.out.println("数组a和a2是否相等：" + Arrays.equals(a,a2));
		
		//复制a数组生成一个新的b数组
		int[] b = Arrays.copyOf(a, 6);
		System.out.println("数组b的元素为:" + Arrays.toString(b));

		//将b的第3个(包括)到第5个元素(不包括)赋值为1
		Arrays.fill(b, 2,4, 1);
		System.out.println("数组b的元素为:" + Arrays.toString(b));

		//对b排序
		Arrays.sort(b);
		System.out.println("数组b的元素为:" + Arrays.toString(b));


	}
}

