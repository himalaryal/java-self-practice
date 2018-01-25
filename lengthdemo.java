package self;

public abstract class lengthdemo {
	abstract int length();
	public static void main(String[] args) {
		 char a[] = { 'a', 'b', 'c' };    
		String s = new String(a);    
		System.out.println(s.length()); 
	}

}
