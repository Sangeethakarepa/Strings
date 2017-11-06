import java.util.HashMap;

public class CountChar {
	public static void charCount(String str){
		HashMap<Character, Integer> count=new HashMap<Character, Integer>();
		char[] strArray=str.toCharArray();
		for(char c:strArray){
				if(count.containsKey(c)){
					count.put(c, count.get(c)+1);
				}
				else{
					count.put(c,1);
				}
		}
		
		System.out.println(count);
	}

	public static void main(String[] args) {
		charCount("Java J2EE spring Mvc");
		charCount("Welcome to java");

	}

}
