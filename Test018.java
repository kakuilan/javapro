//比较运算
public class Test018 {
	public static void main(String[] args) {
		System.out.println("5是否大于4.0:"+ (5>4.0));
		System.out.println("5和5.0是否相等:"+ (5==5.0));
		System.out.println("97和'a'是否相等:"+ (97=='a'));
		System.out.println("true和false是否相等:"+ (true==false));

		//创建2个Test018对象,分别赋给t1和t2
		Test018 t1 = new Test018();
		Test018 t2 = new Test018();

		//t1、t2是同一个类的2个实例的引用,所以可比较
		//但t1和t2引用不同的对象,所以返回false
		System.out.println("t1是否等于t2:"+ (t1==t2));
		//直接将t1的值赋给t3,即让t3指向t1指向的对象
		Test018 t3 = t1;
		System.out.println("t1是否等于t3:"+ (t1==t3));

	}
}
