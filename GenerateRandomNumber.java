import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class GenerateRandomNumber extends ConsoleProgram{
	private RandomGenerator  RG = RandomGenerator.getInstance();
	
	public void run()
	{
		int Rnum = RG.nextInt(0, 10);
		System.out.println(Rnum);
	}
}
