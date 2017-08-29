//引用对象的值传递
class DataWrap {
	int a;
	int b;
}

public class Test037 {

	public static void swap(DataWrap dw) {
		System.out.println("swap方法前，a的值:"+dw.a+" b的值:"+dw.b);

		int tmp = dw.a;
		dw.a = dw.b;
		dw.b = tmp;

		System.out.println("swap方法后，a的值:"+dw.a+" b的值:"+dw.b);
	}

	public static void main(String[] args) {
		DataWrap dw = new DataWrap();
		dw.a = 6;
		dw.b = 9;
		swap(dw);
		System.out.println("交换结束后，a的值:"+dw.a+" b的值:"+dw.b);
	}


}
