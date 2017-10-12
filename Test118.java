//Calendar与Date转换
import java.util.Date;
import java.util.Calendar;


public class Test118 {
	public static void main(String[] args) {
		//创建一个默认的Calendar对象
		Calendar calendar = Calendar.getInstance();
		//从Calendar对象中取出Date对象
		Date date = calendar.getTime();

		//通过Date对象获取对应的Calendar对象
		//因为Calendar/GregorianCalendar没有构造函数可以接收Date对象
		//所以必须先获得一个Calendar实例，然后调用其setTime()方法
		Calendar calendar2 = Calendar.getInstance();
		calendar2.setTime(date);

		System.out.println(calendar);
		System.out.println(date);
		System.out.println(calendar2);


	}
}
