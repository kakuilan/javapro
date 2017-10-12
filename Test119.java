//Calendar类
import java.util.Calendar;

public class Test119 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		//取出年
		System.out.println(c.get(Calendar.YEAR));
		//取出月
		System.out.println(c.get(Calendar.MONTH));
		//取出日
		System.out.println(c.get(Calendar.DATE));
		//分别设置年、月、日、小时、分钟、秒
		c.set(2003, 10, 23, 12, 32, 23);
		System.out.println(c.getTime());
		//将Calendar的年前推1年
		c.add(Calendar.YEAR, -1);
		System.out.println(c.getTime());
		//将Calendar的月前推8个月
		c.roll(Calendar.MONTH, -8);
		System.out.println(c.getTime());


	}
}
