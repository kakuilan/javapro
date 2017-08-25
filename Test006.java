//基本类型转换为字符串
public class Test006 {
	public static void main(String[] args) {
		//一个基本类型的值和字符串进行连接运算时,基本类型的值自动转换为字符串
		String str2 = 3.5f +"";
		System.out.println(str2);
		System.out.println(3+4+"Hello!");
		System.out.println("Hello!"+3+4);
	}
}
