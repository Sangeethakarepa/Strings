import java.util.Scanner;

public class Palindrome {
public static void main(String args[]){
	String s, rev="";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your string:");
	s=sc.next();
	int length=s.length();
	for(int i=length-1;i>=0;i--){
		rev=rev+s.charAt(i);
	}
		if(s.equals(rev)){
			System.out.println("String is palindrome");
		}
		else{
			System.out.println("String is not Palindrome");
		}
	

	
	
	
	
	
}
}
	