
public class CharCount {

	public static void main(String[] args) {
		String s="sangeetha";
		char c='e';
		int count=s.length()-s.replace("e","").length();
		System.out.println("Words are:"+s+"="+count);
	}

}
