//Lambda引用类方法
@FunctionalInterface
interface Converter{
	//将String转换为Integer
	Integer convert(String from);
}

public class Test088 {
	public static void main(String[] args) {
		//使用Lambda表达式创建Converter对象
		Converter converter1 = from -> Integer.valueOf(from);

		Integer val = converter1.convert("99");
		System.out.println(val);
	}
}
