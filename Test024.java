public class Test024 {
	public static void main(String[] args) {
		//数组的定义和初始化同时完成,使用动态初始化语法
		int[] prices = new int[5];
		//数组的定义和初始化同时完成,初始化数组时元素的类型是定义数组时元素类型的子类
		Object[] books = new String[4];
		Object[] objArr;
		objArr = new String[] {"Java","李刚"};
		System.out.println(objArr[1]);

		for (int i=0;i<prices.length;i++) {
			System.out.println(prices[i]);
		}

		//对动态初始化后的数组元素进行赋值
		books[0] = "疯狂java讲义";
		books[1] = "java实战";
		for(int i = 0;i<books.length;i++) {
			System.out.println(books[i]);
		}

	}
}
