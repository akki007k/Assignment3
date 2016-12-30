import java.util.Scanner;

class Assignment_3_2 {
	public static void main(String args[])  /* Main Method */ 
	{
		Scanner input = new Scanner(System.in); /* input through user*/
		
		System.out.println("Enter the string S1 = "); /* write the string s1 as u want */
		String S1 = input.next();  
		System.out.println("Enter the string S2 = "); /* write the string s2 as u want */
		String S2 = input.next();
		boolean compare;  /* boolean variable */
		compare= S1.equals(S2); /* compare the two strings*/
		{
			System.out.println("Returned Value = "+compare);  /* if both the string are same than it will print true otherwise it will print false*/
		}
		
	}

}