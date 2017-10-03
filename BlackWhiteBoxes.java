import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import javax.swing.JApplet;

public class BlackWhiteBoxes  extends GraphicsProgram
{
private static final int Rows = 4;
private static final int Columns = 4;

public void run()
{
	int Sqsize = getHeight() / Rows;
	for(int i =0 ; i< Rows ; i++)
	{
		for(int j=0; j< Columns;j++)
		{
			int x = j* Sqsize;
			int y = i* Sqsize;
			GRect Rect = new GRect(x,y,Sqsize,Sqsize);
			Rect.setFilled((((i+j) %2) ==0));
			add(Rect);
		}
	}
	
	/*GRect Rect2 = new GRect(200,200,400,400);
	int Sqsize2 = (int) Rect2.getHeight();
	for(int k =0; k <Rows ; k++)
	{
		for(int l = 0; l< Columns; l++ )
		{
			int x = l*Sqsize2;
			int y = l*Sqsize2;
			Rect2.setLocation(Sqsize2,Sqsize2);
			Rect2.setFilled(((k+l)%2) == 0);
			add(Rect2);
		}
	}*/
		
	
	
	
}
	}
