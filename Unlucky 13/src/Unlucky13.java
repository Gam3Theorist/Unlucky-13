import java.util.Scanner;

public class Unlucky13
	{
		static Scanner userIntInput = new Scanner(System.in);
		static Scanner userStringInput = new Scanner(System.in);

		public static void main(String[] args)
			{

				counter13();

//				System.out.println(Numbers.numbers);

			}

		public static void counter13()
			{
				
				int counter = 0;
				for (int i = 0; i < Numbers.numbers.length-1; i++)
					{
						if (Numbers.numbers[i] == 13)
							{
								counter += 1;
								Numbers.numbers[i] = 7;
							}
						else
							{
								
							}
						
					}
				System.out.println("There were " + counter + " 13s that are now 7s.");
				for (int i = 0; i < Numbers.numbers.length-1; i++)
					{
						System.out.print(Numbers.numbers[i]+" ");
					}
			}
	}
