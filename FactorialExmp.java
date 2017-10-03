import acm.program.ConsoleProgram;

public class FactorialExmp extends ConsoleProgram {

	private static final int Max_Num = 10;

	public void run()
	{
	for(int i = 0; i<= Max_Num; i++)
	{
		System.out.println(i+ "!"+ Factorial (i));
	}
	}
	
	private int Factorial(int n)
	{
		int Result = 1;
		for(int i = 1 ; i<=n ; i++)
		{
			Result *= i;
		}
		return Result;
	}
}
