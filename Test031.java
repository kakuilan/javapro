//将浮点数转换人民币读法字符串
import java.util.Arrays;

public class Test031 {
	private String[] hanArr = {"壹","贰","叁","肆","伍","陆","柒","捌","玖"};
	private String[] unitArr = {"拾","佰","仟"};

	/*
	 * 把一个浮点数分解为整数和小数部分的字符串
	 * @param num 需要被分解的浮点数
	 * @return 分解出来的整数部分和小数部分,数组
	 */
	private String[] divide(double num) {
		//将浮点数转换为long,即得到它的整数部分
		long zheng = (long)num;
		//浮点数减去整数,得到小数
		long xiao = Math.round((num-zheng) * 100);
		return new String[] {zheng+"", String.valueOf(xiao)};
	}

	/*
	 * 把4位数字字符串变为汉字字符串
	 * @param numStr 需要被转换的4位数字字符串
	 * @return 汉字字符串
	 */
	private String toHanStr(String numStr) {
		String result = "";
		int numLen = numStr.length();
		for (int i =0;i<numLen;i++) {
			//把char型数字转换为int型数字,因为它们的ASCII码值恰好相差48
			//因此把char型数字减去48得到int型数字
			int num = numStr.charAt(i) - 48;
			//如果不是最后一位数字,且不是0，则添加单位
			if (i!=numLen-1 && num!=0) {
				result += hanArr[num] + unitArr[numLen -2 -i];
			}else{
				result += hanArr[num];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Test031 nr = new Test031();
		//测试将浮点数分解
		System.out.println(Arrays.toString(nr.divide(112341234.345)));
		//测试转换汉字
		System.out.println(nr.toHanStr("2354"));
	}



}
