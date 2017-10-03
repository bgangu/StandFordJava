import java.util.Scanner;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class RoolingDies extends ConsoleProgram {
	private static final int Max_Sides = 6; //sides of die
	
	public void run()
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Number of Dies : ");
		int Num_Dies = Sc.nextInt();
		int Max_Rolls = Max_Sides * Num_Dies;
		int Roll_Num = 0;
		while(true)
		{
			int Roll = RollNum(Roll_Num);
			Roll_Num++;
			if(Roll_Num == Max_Rolls); break;
		}
		System.out.println("It took" + Roll_Num +"'s to get the max roll num");
		}
	
	private int RollNum(int Roll_Number)
	{
		int Total = 0;
		for(int i =0 ; i< Roll_Number; i++)
		{
			Total += RG.nextInt(1,Max_Sides);
		}
		return Total;
	}
	
	private RandomGenerator RG = RandomGenerator.getInstance();

}
