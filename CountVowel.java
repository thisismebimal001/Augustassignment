package august4thassignment;
import java.util.*;
/*to take a string and print no of vowels in it */
public class CountVowel {
	public static void main(String[] args) {
		int flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		s=s.toLowerCase();
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
			{
				flag++;
			}
		}
		System.out.println("No of vowel in string is : "+flag);
	}

}
