package self;

import java.util.Scanner;

public class aryal {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		himal aryalobject=new himal();
		System.out.println("enter the name of your first gf: ");
		String temp = sn.nextLine();
		aryalobject.setName(temp);
		aryalobject.saying();
	
		
		
	}

}
