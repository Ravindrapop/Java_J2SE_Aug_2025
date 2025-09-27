package operators.java.pb;

public class EqualityOperator {
	public static void main(String[] args) {
		System.out.println(10<20);
		System.out.println(10>20);
		System.out.println(10==20);
		System.out.println(20==20);
		System.out.println('a'<20);
		System.out.println('a'<'A');
		System.out.println('b'>20);
		Thread t1=new Thread();
		Object obj=new Object();
		String s=new String();
		System.out.println(t1==obj);
		System.out.println(obj==s);
		
	
	
	
	
	}

}
