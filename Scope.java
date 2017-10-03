
public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<=10 ; i++)
		{
			int j=0;
			j++;
		}
	// System.out.println(j); // J is invalid as J's scope ends after the for loop in which it is defined
		int a = 17;
		int b = 13;
		if((a+b)%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		
		for(int i = 10 ; i >= 0 ; i = i -2)
		{
			System.out.println(i);
		}

	}

}
