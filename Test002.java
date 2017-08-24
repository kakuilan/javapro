public class Test002{
	//字符型变量
	public static void main(String[] args){
		//直接指定单个字符作为字符值
		char aChar = 'a';
		//使用转义表示
		char enterChar = '\r';
		//使用Unicode编码
		char ch = '\u9999';
		
		System.out.println(ch);

		//定义一个'好'字符值
		char zhong = '好';
		//直接将一个char变量当成int类型变量使用
		int zhongVal = zhong;
		System.out.println(zhongVal);
		//直接把0~65535范围的int整数赋值给一个char变量
		char c = 97;
		System.out.println(c);


	}
}
