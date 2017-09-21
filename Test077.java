//工厂模式
class Computer {
	private Output out;
	public Computer(Output out) {
		this.out = out;
	}

	//定义一个模拟获取字符串输入的方法
	public void keyIn(String msg) {
		out.getData(msg);
	}

	//定义一个模拟打印的方法
	public void print(){
		out.out();
	}
}

class OutputFactory{
	public Output getOutput(){
		return new BetterPrinter();
	}
}

class BetterPrinter implements Output {
	private String[] printData = new String[MAX_CACHE_LINE *2];
	private int dataNum = 0;

	public void out(){
		while(dataNum>0) {
			System.out.println("高速打印机正在打印："+printData[0]);
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
	}

	public void getData(String msg) {
		if(dataNum>=MAX_CACHE_LINE *2) {
			System.out.println("输出队列已满，添加失败");
		}else{
			printData[dataNum++] = msg;
		}
	}
}

public class Test077 {
	public static void main(String[] args) {
		OutputFactory of = new OutputFactory();
		Computer c = new Computer(of.getOutput());
		c.keyIn("轻量级Java EE实战");
		c.keyIn("疯狂Java讲义");
		c.print();
	}
}
