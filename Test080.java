//内部类的局部变量同名
public class Test080 {
	private String prop = "外部类的实例变量";

	private class InClass {
		private String prop = "内部类的实例变量";
		public void info(){
			String prop = "局部变量";
			//通过外部类类名.this.varName访问外部类实例变量
			System.out.println("外部类的实例变量值:"+ Test080.this.prop);
			//通过this.varName访问内部类实例的变量
			System.out.println("内部类的实例变量值："+this.prop);
			//直接访问局部变量
			System.out.println("内部类的局部变量值："+prop);
		}
	
	}

	public void test(){
		InClass in = new InClass();
		in.info();
	}

	public static void main(String[] args) {
		new Test080().test();
	}
	
}
