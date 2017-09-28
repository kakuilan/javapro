//垃圾回收finalize
public class Test101 {

	private static Test101 ft = null;

	public void info() {
		System.out.println("测试资源清理的finalize方法");
	}

	public void finalize() {
		//让ft引用到试图回收的可恢复对象，即可恢复对象重写变成可达
		ft = this;
	}

	public static void main(String[] args) throws Exception {
		//创建Test101对象立即进入可恢复状态
		new Test101();
		//通知系统进行资源回收
		System.gc();
		//强制垃圾回收机制调用可恢复对象的finalize()方法
		//Runtime.getRuntime().runFinalization();
		System.runFinalization();
		ft.info();
	}

}
