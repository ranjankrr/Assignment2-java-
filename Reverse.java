//write a program Reverse number

public class Reverse {
	
	public static void main(String args[]) {
		
		int num =12345, rem,reverse=0;
		while(num !=0) {
			rem = num %10;
			reverse = reverse * 10 +rem;
			num=num/10;
		}
		System.out.println("print reverse Number = " +reverse);
	}

}
