//实现接口的枚举类
interface GenderDesc {
	void info();
}

enum Gender implements GenderDesc {
	MALE("男"),FEMALE("女");

	private final String name;

	private Gender(String name) {
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void info(){
		System.out.println("这是一个用于调用性别的枚举类");
	}
}

public class Test097 {
	public static void main(String[] args) {
		Gender g = Gender.valueOf("FEMALE");
		g.info();
	}
}
