//Lambada表达式
interface Command {
	//接口定义process方法用于封装"处理行为"
	void process(int[] target);
}

class ProcessArray{
	public void process(int[] target,Command cmd) {
		cmd.process(target);
	}
}

class PrintCommand implements Command{
	public void process(int[] target) {
		for(int tmp : target) {
			System.out.println("迭代输出目标数组的元素:"+ tmp);
		}
	}
}

class AddCommand implements Command {
	public void process(int[] target) {
		int sum = 0;
		for(int tmp : target) {
			sum += tmp;
		}
		System.out.println("数组元素的总和是:"+sum);
	}
}

public class Test078 {
	public static void main(String[] args) {
		ProcessArray pa = new ProcessArray();
		int[] target = {3,-4, 6,4};
		//第一次处理数组,具体处理行为取决于PrintCommand
		pa.process(target, new PrintCommand());
		System.out.println("-------------------");
		//第二次处理数组,具体处理行为取决于AddCommand
		pa.process(target, new AddCommand());

	}
}
