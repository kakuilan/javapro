//生成随机数
public class Test008 {
	public static void main(String[] args) {
		//定义一个空字符串
		String result = "";
		//进行6次循环
		for(int i =0; i<6;i++) {
			//生成一个97~122之间的int类型整数
			int intVal = (int)(Math.random() *26 + 97);
			//将intVal强制转换位char类型后连接到result
			result = result +(char)intVal;
		}
		//输出随机字符串
		System.out.println(result);

		//下面一行容易出错的代码
		//直接把5.6赋给float将出错,因为5.6默认是double类型
		//float a = 5.6;
		//正确的应该是
		float a = (float)5.6;
		//字符串转换为整型
		String b = "45";
		int iValue = Integer.parseInt(b);
		System.out.println(a);
		System.out.println(b);
	}
}
