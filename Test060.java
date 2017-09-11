//类的初始化块
public class Test060 {
	//下面定义一个初始化块\
	{
		int a = 6;
		if(a>4) {
			System.out.println("Tst060初始化块：局部变量a的值大于4");
		}
	}

	//定义第二个初始化块
	{
		System.out.println("Test060的第二个初始化块");
	}

	//定义无参数的构造器
	public Test060(){
		System.out.println("Test060的无参数构造器");
	}

	public static void main(String[] args){
		new Test060();
	}

}
