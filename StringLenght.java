import java.util.Scanner;

public class StringLenght {
	public static void main(String args[]) {
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Name");
		name=sc.nextLine();
		if(name.length()<10){
			System.out.println("A name is shortName");
			
		}
		else {
			System.out.println("A name a longName");
		}
		
		
	}

}
