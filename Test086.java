//Lambada表达式例子
interface Command {
	//接口定义process方法用于封装"处理行为"
	void process(int[] target);
}

class ProcessArray{
	public void process(int[] target,Command cmd) {
		cmd.process(target);
	}
}


public class Test086 {
	public static void main(String[] args) {
		ProcessArray pa = new ProcessArray();
		int[] array = {3,-4, 6,4};
		//处理数组，具体处理行为取决于匿名内部类
		pa.process(array, (int[] target)->{
			int sum = 0;
			for(int tmp : target) {
				sum += tmp;
			}
			System.out.println("数组元素的总和是:"+sum);
		});
	}
}
