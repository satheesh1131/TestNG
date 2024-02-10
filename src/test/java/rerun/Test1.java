package rerun;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void division() {
		System.out.println("Enter the first number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter the second number:");
		int b=sc.nextInt();
		int c=a/b;
		System.out.println("The divided value is "+c);	
		sc.close();
	}
}
