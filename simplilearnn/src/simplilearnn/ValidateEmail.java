package simplilearnn;
import java.util.*;
import java.util.regex.Pattern;

public class ValidateEmail {
	public static boolean isValid(String str)
	{
		String emailregex="^[a-zA-Z0-9_+&*-]+(?:\\."+
	                      "[a-zA-z0-9_+&*-]+)*@"+
				          "(?:[a-zA-Z0-9]+\\.)+[a-z"+
	                      "A-Z]{2,7}$";
		
		Pattern p=Pattern.compile(emailregex);
		if(str==null)
			return false;
		else
		{
			return p.matcher(str).matches();
		}
	              
				
				
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str;
		System.out.println("enter the email id");
		str=s.next();
		if(isValid(str))
			System.out.println("It is a valid emai id");
		else
			System.out.println("It is an invalid email id");
		
		
		
		
				
		

	}

}
