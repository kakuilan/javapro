//枚举类带参数构造器
enum Gender {
	//此处的枚举值必须调用对应的构造器来创建
	MALE("男"),FEMALE("女");
	//上面代码相当于
	//public static final Gender MALE = new Gender("男");
	//public static final Gender FEMALE = new Gender("女");
	
	private final String name;

	//枚举类的构造器只能使用private修饰
	private Gender(String name) {
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

}

public class Test096 {
	public static void main(String[] args) {
		Gender g = Gender.valueOf("FEMALE");
		System.out.println(g+"代表:"+g.getName());
	}
}
