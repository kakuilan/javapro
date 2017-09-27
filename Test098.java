//接口枚举类-不同实现方法
interface GenderDesc {
	void info();
}

enum Gender implements GenderDesc {
	MALE("男")
	//花括号部分实际上是一个类体部分
	{
		public void info(){
			System.out.println("这个枚举值代表男性");
		}
	}
	,FEMALE("女"){
		public void info(){
			System.out.println("这个枚举值代表女性");
		}
	};

	private final String name;

	private Gender(String name) {
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

}

public class Test098 {
	public static void main(String[] args) {
		Gender g = Gender.valueOf("FEMALE");
		g.info();
	}
}
