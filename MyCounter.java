public class MyCounter {

	public MyCounter() //Constructor
	{
		Counter = 1;
	}
	
	public MyCounter(int GetValue) //Constructor 
	{
		Counter = GetValue;
	}
	
	public int Count() //Counter
	{
		int Temp = Counter;
		Counter++;
		return Temp;
	}
	
	//This is an instance variable
	//Each object of the class will have it's own version of instance variable. That's why both Mc and Mc1 have their own values for counter
	private int Counter;
	
}
