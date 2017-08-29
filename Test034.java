//类的this使用
public class Test034 {
	//定义一个jump方法
	public void jump() {
		System.out.println("正在指向jump方法");
	}

	//定义一个run方法,run方法需要借助jump方法
	public void run() {
		this.jump(); //使用this关键字
		jump(); //省略this
		System.out.println("正在执行run方法");
	}
	
	public static void main(String[] args) {
		Test034 obj = new Test034();
		obj.run();
	}

}
