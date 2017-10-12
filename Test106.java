//Scanner读取文件输入
import java.util.Scanner;
import java.io.File;

public class Test106 {

	public static void main(String[] args) throws Exception {
		//将一个File对象作为Scanner的构造器参数,Scanner读取文件内容
		Scanner sc = new Scanner(new File("Test105.java"));
		System.out.println("Test105.java文件内容如下:");

		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}
}

