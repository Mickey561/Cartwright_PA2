import java.util.Scanner;

public class Cartwright_P1 {

	public static void main(String[] args) 
	{
		int orig, i, temp1, temp2;
		int[] digits = new int[4];
		String choice;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Choose one of the Following: (Encrypt or Decrypt)");
		choice = scnr.nextLine();
		
		// Choice process of Enrypt
		if (choice.equalsIgnoreCase(("encrypt")))
		{
			System.out.print("Enter 4-digit number: ");
			orig = scnr.nextInt();
			
			for (i = digits.length - 1; i >= 0; i--)
			{
				digits[i] = orig % 10;
				digits[i] = (digits[i] + 7) % 10;
				orig = orig / 10;
			}
			
			temp1 = digits[0];
			digits[0] = digits[2];
			digits[2] = temp1;
			
			temp2 = digits[1];
			digits[1] = digits[3];
			digits[3] = temp2;
			
			for(i = 0; i < digits.length; i++)
			{
				System.out.print(digits[i]);	
			}
		}
		
		// Choice process of Decrypt
		else if (choice.equalsIgnoreCase("decrypt"))
		{
			System.out.print("Enter 4-digit number: ");
			orig = scnr.nextInt();
			
			for (i = digits.length - 1; i >= 0; i--)
			{
				digits[i] = orig % 10;
				if (digits[i] < 7)
				{
					digits[i] = digits[i] + 10;
				}
				digits[i] -= 7;
				orig = orig / 10;
			}
				temp1 = digits[0];
				digits[0] = digits[2];
				digits[2] = temp1;
				
				temp2 = digits[1];
				digits[1] = digits[3];
				digits[3] = temp2;
				
			for(i = 0; i < digits.length; i++)
			{
				System.out.print(digits[i]);	
			}
		}
		scnr.close();	
	}
}