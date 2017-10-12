//Random类
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Test114 {
	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println("rand.nextBoolean():"+ rand.nextBoolean());
		byte[] buffer = new byte[16];
		rand.nextBytes(buffer);
		System.out.println(Arrays.toString(buffer));
		//生成0.0~1.0之间的伪随机float数
		System.out.println("rand.nextFloat():"+ rand.nextFloat());
		//生成平均值是0.0,标准差是1.0的伪高斯数
		System.out.println("rand.nextGaussian():"+ rand.nextGaussian());
		//生成一个处于int整数取值范围的伪随机整数
		System.out.println("rand.nextInt():"+ rand.nextInt());
		//生成一个0~26之间的伪随机整数
		System.out.println("rand.nextInt(26):"+ rand.nextInt(26));
		//生成一个处于long整数取值范围的伪随机整数
		System.out.println("rand.nextLong():"+ rand.nextLong());
		
		//random种子
		Random r1 = new Random(50);
		System.out.println("第一个种子为50的Random对象");
		System.out.println("r1.nextBoolean():\t"+ r1.nextBoolean());
		System.out.println("r1.nextInt():\t\t"+ r1.nextInt());
		System.out.println("r1.nextDouble():\t"+ r1.nextDouble());
		System.out.println("r1.nextGaussian():\t"+ r1.nextGaussian());
		System.out.println("---------------------------");

		Random r2 = new Random(50);
		System.out.println("第二个种子为50的Random对象");
		System.out.println("r2.nextBoolean():\t"+ r2.nextBoolean());
		System.out.println("r2.nextInt():\t\t"+ r2.nextInt());
		System.out.println("r2.nextDouble():\t"+ r2.nextDouble());
		System.out.println("r2.nextGaussian():\t"+ r2.nextGaussian());
		System.out.println("---------------------------");

		Random r3 = new Random(100);
		System.out.println("第三个种子为100的Random对象");
		System.out.println("r3.nextBoolean():\t"+ r3.nextBoolean());
		System.out.println("r3.nextInt():\t\t"+ r3.nextInt());
		System.out.println("r3.nextDouble():\t"+ r3.nextDouble());
		System.out.println("r3.nextGaussian():\t"+ r3.nextGaussian());
		System.out.println("---------------------------");

		//ThreadLocalRandom
		ThreadLocalRandom trnd = ThreadLocalRandom.current();
		//生成一个4~20之间的伪随机整数
		int val1 = trnd.nextInt(4, 20);
		//生成一个2.0~10.0之间的伪随机浮点数
		double val2 = trnd.nextDouble(2.0, 10.0);
		System.out.println(val1);
		System.out.println(val2);

	}
}
