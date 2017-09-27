//Lambda引用构造器
import javax.swing.*;

@FunctionalInterface
interface YourTest {
	JFrame win(String title);
}

public class Test090 {

	public static void main(String[] args) {
		//下面代码使用Lambda表达式创建YourTest对象
		YourTest yt = (String a) -> new JFrame(a);
		JFrame jf = yt.win("我的窗口");
		System.out.println(jf);
	}

}
