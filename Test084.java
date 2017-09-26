//匿名内部类
interface Product{
	public double getPrice();
	public String getName();
}

public class Test084 {
	public void test(Product p) {
		System.out.println("购买了一个"+p.getName()+",花了"+p.getPrice());
	}

	public static void main(String[] args) {
		Test084 ta = new Test084();
		//调用test()方法时，需要传入一个Product参数
		//此处传入其匿名实现类的实例
		ta.test(new Product(){
			public double getPrice(){
				return 567.8;
			}

			public String getName(){
				return "AGP显卡";
			}
		});
	}
}
