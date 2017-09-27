//枚举类
enum SeasonEnum {
	//在第一行列出4个枚举实例
	SPRING,SUMMER,FALL,WINTER;
}

public class Test093 {
	public void judge(SeasonEnum s) {
		//switch语句里的表达式可以是枚举值
		switch(s) {
			case SPRING:
				System.out.println("春暖花开，正好踏青");
				break;
			case SUMMER:
				System.out.println("夏日炎炎，正好游泳");
				break;
			case FALL:
				System.out.println("秋高气爽，正好出游");
				break;
			case WINTER:
				System.out.println("冬日飘雪，围炉夜话");
				break;
		}
	}

	public static void main(String[] args) {
		//枚举类默认有一个values()方法，返回该枚举类的所有实例
		for(SeasonEnum s : SeasonEnum.values()) {
			System.out.println(s);
		}
		//使用枚举类实例时，可通过EnumClass.variable形式来访问
		new Test093().judge(SeasonEnum.SPRING);
	}
}
