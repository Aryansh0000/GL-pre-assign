package DemoAssign;

import java.util.Scanner;
	

public class demo1 {

	public void checkPalindrome() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the input");
		int num1 = inp.nextInt();
		int temp ,sum=0,x;
		temp=num1;
		while(num1>0) {
			x = num1%10;
			sum = (sum*10)+x;
			num1=num1/10;
		}
		if(temp==sum) 
			System.out.println("Its a palindrome");
		else
			System.out.println("Its not a palindrome");
		
	}
	
	public void checkPattern() {
		Scanner inp1 = new Scanner(System.in);
		System.out.println("Enter the input");
		int num2 = inp1.nextInt();
		for(int i=num2;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		
	}
	
	public void checkPrime() {
		Scanner inp2 = new Scanner(System.in);
		System.out.println("Enter the input");
		int num3 = inp2.nextInt();
		int m=0,flag=0;
		m=num3/2;
		for(int i=2;i<=m;i++) {
		if(num3%i==0) {
			System.out.println("Its not prime");
			flag=1;
			break; 
			}
		}	
		if(flag==0)
			System.out.println("Its prime");
		
    }
	
	public void checkFibonnaci() {
		Scanner inp3 = new Scanner(System.in);
			System.out.println("Enter the input");
			int n = inp3.nextInt();
			int n1=0,n2=1,n3,i;
			System.out.print(n1 + " " + n2 + " ");
			for(i=2;i<n;i++) {
				n3=n1+n2;
				n1=n2;
				n2=n3;
				System.out.print(n3 + " ");
			} 
			System.out.println();
		}
		
	

	

	public static void main(String[] args) {
		demo1 obj = new demo1();
		int num;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Select the function no.");
		num = sc.nextInt();
		switch(num) {
		
			case 0:{ num=0;
				break; }
			case 1: {obj.checkPalindrome();
				break;}
			case 2: {obj.checkPattern();
				break;}
			case 3: {obj.checkPrime();
				break;}
			case 4: {obj.checkFibonnaci();
				break;}
			default: System.out.println("Invalid Choice");	
			}
		 } while(num!=0);
			System.out.println("Executed Successfully");
			sc.close();
			
	
	}

}
