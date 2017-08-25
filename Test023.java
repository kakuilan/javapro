//数组
public class Test023 {

	public static void main(String[] args) {
		//定义一个int数组类型的变量,变量名intArr
		int[] intArr;
		//使用静态初始化,初始化数组时只指定数组元素的初始值,不指定数组长度
		intArr = new int[]{5,6,8,20};
		//定义一个object数组类型的变量
		Object[] objArr;
		//使用静态初始化,初始化数组时数组元素的类型是
		//定义数组时所指定的数组元素类型的子类
		objArr = new String[] {"Java","李刚"};
		Object[] objArr2;
		objArr2 = new Object[] {"Go","hum"};
		
		System.out.println(objArr);
		System.out.println(objArr2);
	}
}


