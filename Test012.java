//常量池中的字符串直接量
public class Test012 {

	public static void main(String[] args) {
		String s0 = "hello";
		String s1 = "hello";
		String s2 = "he"+"llo";
		System.out.println(s0==s1);
		System.out.println(s0==s2);
	
	}
}
