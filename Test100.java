//强制垃圾回收
//java -verbose:gc Test100
public class Test100 {
	public void finalize(){
		System.out.println("系统正在清理Test100对象的资源...");
	}

	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			new Test100();
			//下面2行代码的作用完全相同，都是强制垃圾回收
			//System.gc();
			Runtime.getRuntime().gc();
		}
	}

}
