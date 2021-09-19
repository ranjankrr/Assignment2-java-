// Write a program palidrome number

import java.util.Scanner;

public class Palidrome{
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int org_num=num;
		int rem, reverse=0;
		while(num !=0){
			rem=num % 10;
			reverse = reverse * 10 +rem;
			num =num/10;
			}
		if(org_num==reverse) {
			
			System.out.println(org_num +"Palidrome number");
		}
		else {
			System.out.println(org_num +"Not A Palidrome number");
		}
		

	}

}
