//args参数
//执行 java Test104 arg1 arg2 arg3 arg4
public class Test104 {
	public static void main(String[] args) {
		//输出args数组的长度
		System.out.println(args.length);
		//遍历args数组的每个元素
		for(String arg: args) {
			System.out.println(arg);
		}
	}
}
