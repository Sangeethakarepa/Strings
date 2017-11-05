
public class WhiteSpaces {

	public static void main(String[] args) {
		String str="Welcome to Java";
		
		String s1=str.replaceAll("\\s","");
		System.out.println(s1);
		
		
		/*char[] strArray = str.toCharArray();
		 
        StringBuffer sb = new StringBuffer();
 
        for (int i = 0; i < strArray.length; i++)
        {
            if( (strArray[i] != ' ') && (strArray[i] != '\t') )
            {
                sb.append(strArray[i]);
            }
        }
 
        System.out.println(sb);   */
		
    }
}
