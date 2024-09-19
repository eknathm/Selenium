package FamousProgramsInJava;

//Program to identify whether a number is Palidrome or not
public class PalidromeNumber {
	
	public static void main(String[] args) {
		
	int num = 12323456;
	int temp = num;
	int rev = 0;
	
	while(num>0) {
		int d = num%10;
		rev = rev*10 + d;
		num = num/10;
	}
	System.out.println("Original Number : " + temp);	
	System.out.println("Reversed Number : " + rev);		
	
	if(temp==rev) {
		System.out.println("Number is palindrome");
	}
	else {
		System.out.println("Number is not a palindrome");
	}
	
	}

}
