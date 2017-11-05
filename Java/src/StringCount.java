import java.util.Scanner;

public class StringCount {
public static void main(String args[]){
	System.out.println("Enter the String");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String[] words=s.trim().split("");
	System.out.println("World length:"+words.length);
}
}
