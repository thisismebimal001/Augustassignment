package august4thassignment;
import java.util.*;
/*program to check string is palindrome or not*/
public class StrRev {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.nextLine();
		//String s = new String("Student");
		char ch1[]=s.toCharArray();
		String rev="";
		
		
		for(int i=s.length()-1; i>=0 ; i--)
		{
			rev+= ch1[i];
		}
		if(s.equals(rev))
		{
			System.out.println("String is palindrome!");
		}
		else
		{
			System.out.println("String is not a palindrome.");
		}

	}

}
