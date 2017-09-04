//静态导入
import static java.lang.System.*;
import static java.lang.Math.*;

public class Test045 {
	public static void main(String[] args) {
		// out是java.lang.System类的静态成员变量,代表标准输出
		// PI是java.lang.Math类的静态成员变量,表示pi常量
		out.println(PI);
		//直接使用Math类的sqrt静态方法
		out.println(sqrt(256));
	}
}
