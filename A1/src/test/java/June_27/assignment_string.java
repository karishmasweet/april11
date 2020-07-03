package June_27;

import java.util.Scanner;

public class assignment_string 
{
	static void reverseEachWordOfString(String str)
    {
		{
			/* The split() method of String class splits
			 * a string in several strings based on the
			 * delimiter passed as an argument to it
			 */
			String[] words = str.split(" ");
			//System.out.println(words[0]);
			String reversedString = "";
			for (int i = 0; i < words.length; i++)
		     {
		           String word = words[i]; 
		          // System.out.println(word);
		           String reverseWord = "";
		           for (int j = word.length()-1; j >= 0; j--) 
			   {
				/* The charAt() function returns the character
				 * at the given position in a string
				 */
				reverseWord = reverseWord + word.charAt(j);
				//System.out.println(reverseWord);
			   }
			   reversedString = reversedString + reverseWord + " ";
			   
			}
			
			System.out.println(str);
			System.out.println(reversedString);
		}
		
 }
		   public static void main(String[] args) 
		   {
			   assignment_string  obj = new assignment_string ();  
			obj.reverseEachWordOfString("my name is deepak");
			
		   }
}
