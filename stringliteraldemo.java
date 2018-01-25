package self;

public abstract class stringliteraldemo {
	abstract int  length();
	
	public static void main(String[] args) {
		char a[] = { 'a', 'b', 'c' }; 
		String s1 = new String(a);  
		String s2 = "abc";
		System.out.println("abc".length());
		System.out.println("===========");
		//string concatation
		String age = "9"; 
		String s = "He is " + age + " years old."; 
		System.out.println(s);

	}
	
}
