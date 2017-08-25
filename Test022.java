//do-while
public class Test022 {
	public static void main(String[] args) {
		int count = 1;
		do {
			System.out.println(count);
			count++;
		}while(count <10);
		System.out.println("循环结束!");

		//至少执行一次
		int count2 = 20;
		do {
			System.out.println(count2++);
		}while(count2<10);
		System.out.println("循环结束");

	}
}
