import java.util.Scanner;

public class Cartwright_P2 {

	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		
		double BMI = 0;
		double weight, height;
		String choice;
		
		System.out.print("Please choose one of the BMI formuals (Imperial or Metric): ");
		System.out.println();
		choice = scnr.nextLine();

		if (choice.equalsIgnoreCase(("metric")))
		{
			System.out.println("Enter Weight (kg): ");
			weight = scnr.nextDouble();
			
			System.out.println("Enter Height (meters): ");
			height = scnr.nextDouble();
			System.out.println();
			
			BMI = weight / Math.pow(height, 2);
			
		}	
				
		if (choice.equalsIgnoreCase(("imperial")))
		{
			System.out.println("Enter Weight (lb): ");
			weight = scnr.nextDouble();
			
			System.out.println("Enter Height (inches): ");
			height = scnr.nextDouble();
			System.out.println();
			
			BMI = (703 * weight) / Math.pow(height, 2);
		}
		
		
		
		if (BMI < 18.5)
		{
			System.out.println("BMI Category: Underweight");
			System.out.printf("%.2f", BMI);
		}
		else if (BMI >= 18.5 && BMI < 25)
		{
			System.out.println("BMI Category: Normal Weight");
			System.out.printf("%.2f", BMI);
		}
		else if (BMI >= 25  && BMI < 30)
		{
			System.out.println("BMI Category: Overweight");
			System.out.printf("%.2f", BMI);
		}
		else
		{
			System.out.println("BMI Category: Obesity");
			System.out.printf("%.2f", BMI);
		}
		
		scnr.close();	
	}

}