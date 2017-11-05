
public class Reverse {

	public static void main(String[] args) {
		/*StringBuffer sbr=new StringBuffer("MyJava");
		System.out.println(sbr.reverse());
		*/
		
		String str="Sangeetha";
		System.out.println("Length:"+str.length());
		char[] s1=str.toCharArray();
		for(int i=s1.length-1;i>=0;i--){
			System.out.print(s1[i]);
		}

	}

}
