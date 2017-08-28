//二维数组
import java.util.Arrays;
public class Test028 {
	public static void main(String[] args) {
		//定义一个二维数组
		int[][] a;
		//把a当成一维数组进行初始化,初始化a是一个长度为4的数组
		//a数组的元素又是引用类型
		a = new int[4][];
		//把a当成一维数组遍历
		for(int i=0,len=a.length;i<len;i++) {
			System.out.println(a[i]);
		}

		//初始化a数组的第一个元素
		a[0] = new int[2];
		a[0][1] = 6;
		for(int i=0,len=a[0].length;i<len;i++) {
			System.out.println(a[0][i]);
		}
	}

	//同时初始化二维数组的2个维度
	int[][] b = new int[3][4];
	//使用静态初始化语法来初始化一个二位数组
	String[][] str1 = new String[][] {new String[3]
	,new String[]{"Helow"}};
	String[][] str2 = {new String[3], new String[]{"world"}};


}
