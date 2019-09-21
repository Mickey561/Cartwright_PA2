import java.util.Scanner;

public class Cartwright_P3 {

	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		
		int users, i, j;
		int max, min;
		String[] topics = {"Asian Food", "Florida Weather", "Video Games", "Donald Trump", "Hillary Clinton"};
		int [][] ratings = new int[5][10];
		double [] average = new double[5];
		int [] sum = new int[5];
		
		System.out.println("How many people are being surveyed?");
		users = scnr.nextInt();
		
		for (i = 0; i < 5; i++)
		{
			average[i] = 0;
			sum[i] = 0;
			for (j=0; j < 10;j++)
			{
				ratings[i][j] = 0;
			}
		}
		
		for (i = 0; i < users; i++)
		{
			System.out.println("User " + (i + 1) + ":");
			
			for (j = 0; j < 5; j++)
			{
				System.out.println("Rate " + topics[j] + " from 1 to 10");
		
				int rate = scnr.nextInt();
				ratings[j][rate - 1]++;
			
			}
		}
		 for (i = 0; i < 5; i++)
		 {
			 for (j = 0; j < 10; j++)
			 {
				 average[i] += ratings [i][j] * (j + 1) * 1.0;
				 sum[i] += ratings[i][j] * (j + 1);
			 }
			 average[i] /= (users * 1.0);
		 }
		
		max = 0;
		min = 0;
		
		for ( i = 0; i < 5; i++)
		{
			if (sum[max] < sum[i])
			{
				max = i;
			}
			if (sum[min] > sum[i])
			{
				min = i;
			}
		}
		System.out.println();
		System.out.printf("%-16s|%20s | %-7s", "Topic", " 1 2 3 4 5 6 7 8 9 10", "Average");
		System.out.println("\n-------------------------------------------------");
		
		for (i = 0; i < 5; i++)
		{
			System.out.printf("%-16s| ", topics[i]);
			for (j = 0; j < 10; j++)
			{
				System.out.printf(ratings[i][j] + " ");
			}

			System.out.printf(" | %5.2f\n",average[i]);
		}
		
		System.out.println("\nThe topic with the most points is " + topics[max]);
		System.out.println("The topic with the least points is " + topics[min]);
		
	}
	

}

