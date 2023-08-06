package august4thassignment;
import java.util.Scanner;
import java.util.*;


/*To Find the frequency of character present in a string*/

public class FreqOfCh {

	public static void main(String[] args) {
		int flag=0;
		String s = new String("cuttack");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character you want to find frequency of: ");
		char ch = sc.next().charAt(0);
		System.out.println(ch);
				
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			{
				flag++;
			}
		}
		System.out.println("Occurance of "+ch +" is :"+flag);
		

	}

}
