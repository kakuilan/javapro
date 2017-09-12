//缓存实例的不可变类
class CacheImmutale {
	private static int MAX_SIZE = 10;
	//使用数组来缓存已有的实例
	private static CacheImmutale[] cache = new CacheImmutale[MAX_SIZE];
	//记录缓存实例在缓存中的位置,cache[pos-1]是最新缓存的实例
	private static int pos = 0;
	private final String name;
	private CacheImmutale(String name) {
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public static CacheImmutale valueOf(String name) {
		//遍历已缓存的对象
		for (int i=0; i< MAX_SIZE; i++) {
			if(cache[i] !=null && cache[i].getName().equals(name)) {
				return cache[i];
			}
		}

		//若缓冲池已满
		if(pos == MAX_SIZE) {
			//把缓存的第一个对象覆盖
			cache[0] = new CacheImmutale(name);
			pos = 1;
		}else{
			//把新建的对象缓存起来，pos加1
			cache[pos++] = new CacheImmutale(name);
		}
		
		return cache[pos-1];
	}

	public boolean equals(Object obj) {
		if(this==obj){
			return true;
		}
		if(obj!=null && obj.getClass()==CacheImmutale.class) {
			CacheImmutale ci = (CacheImmutale)obj;
			return name.equals(ci.getName());
		}
		return false;
	}

	public int hasCode(){
		return name.hashCode();
	}
}

public class Test071 {
	public static void main(String[] args) {
		CacheImmutale c1 = CacheImmutale.valueOf("hello");
		CacheImmutale c2 = CacheImmutale.valueOf("hello");
		System.out.println(c1 == c2);
	}
}
