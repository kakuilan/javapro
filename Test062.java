//自动装箱和自动拆箱
public class Test062 {

	public static void main(String[] args) {
		//直接把一个基本类型变量赋给Integer对象
		Integer inObj = 5;
		//直接把一个boolean类型变量赋给一个Object类型的变量
		Object boolObj = true;
		//直接把一个Integer对象赋给一个int类型的变量
		int it = inObj;

		if (boolObj instanceof Boolean) {
			//先把Object对象强制类型转换为Boolean类型，在赋给boolean变量
			boolean b = (Boolean)boolObj;
			System.out.println(b);
		}
	
	}
}
