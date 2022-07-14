package stream;

public class Singleton {
	private static Singleton t=null;
	public String s;
	private Singleton() {
		s="Singleton ";
	}
	public static Singleton getSingleton() {
		if (t==null) {
			t=new Singleton();
			
			
		}
		return t;
		
	}
	public static void main(String[] args) {
		Singleton s=Singleton.getSingleton();
		System.out.println(s.s);
	}
	

}
