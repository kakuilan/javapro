//表达式类型自动提升的典型错误
public class Test009 {

	public static void main(String[] args) {
		//定义一个short类型
		short sValue = 5;
		//表达式中的sValue将自动提升到int类型,则右边的表达式类型为int
		//将一个int类型赋值给short类型变量将发生错误
		sValue = sValue -2;
		System.out.println(sValue);
	}
}
