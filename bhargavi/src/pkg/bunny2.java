package pkg;

public class bunny2 {
	public bunny2(double a ) {
		System.out.println("hello bhargavi");
		System.out.println(a);
		}
	public bunny2() {
		//by using this key word we can call one constructor with another
		this(2.5);
		System.out.println();
	}
	public static void main(String[] args) {
		bunny2 kb=new bunny2();
		
		
	}

}
