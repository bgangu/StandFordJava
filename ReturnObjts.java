import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class ReturnObjts extends GraphicsProgram {
	
	public void run()
	{
	add(AddMyRect(200,200,200,Color.red));
	}
	
	private GRect AddMyRect(int x,int y,int Sqsize,Color color)
	{
		GRect Gr = new GRect(x,y,Sqsize,Sqsize);
		Gr.setFilled(true);
		Gr.setFillColor(color);
		return Gr;
		
	}
}
