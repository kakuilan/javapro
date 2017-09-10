//对象的强制类型转换
public class Test056 {
	public static void main(String[] args) {
		double d = 13.4;
		long l = (long)d;
		System.out.println(l);

		int in = 5;
		//试图把一个数组类型的变量转换为布尔类型，下面代码编译出错
		//boolean b = (boolean)in;

		Object obj = "Hello";
		//obj变量的编译时类型为Object,Object与String存在继承关系，可以强制类型转换
		//而且obj变量的实际类型是String,所以运行时也可通过
		String objStr = (String)obj;
		System.out.println(objStr);

		//定义一个objPri变量，编译时类型为Object,实际类型为Integer
		Object objPri = new Integer(5);
		//objPri变量的编译时类型为Object，objPri的运行时类型为Integer
		//Object与Integer存在继承关系
		//可以强制类型转换，而objPri变量的实际类型是Integer
		//所以下面代码运行时引发ClassCastException异常
		String str = (String)objPri;
	}
}
