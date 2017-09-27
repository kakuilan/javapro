//枚举类-改进
enum Gender {
	MALE,FEMALE;
	private String name;
	public void setName(String name) {
		switch(this) {
			case MALE:
				if(name.equals("男")) {
					this.name = name;
				}else{
					System.out.println("参数错误");
					return;
				}
				break;
			case FEMALE:
				if(name.equals("女")) {
					this.name = name;
				}else{
					System.out.println("参数错误");
					return;
				}
				break;
		}
	}

	public String getName(){
		return this.name;
	}

}


public class Test095 {
	public static void main(String[] args) {
		Gender g = Gender.valueOf("FEMALE");
		g.setName("女");
		System.out.println(g+"代表:"+g.getName());
		//下面的设置会提示错误
		g.setName("男");
		System.out.println(g+"代表:"+g.getName());
		
	}

}
