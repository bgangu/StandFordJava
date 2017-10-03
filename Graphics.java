import java.awt.Color;
import acm.graphics.*;
import acm.program.*;

public class Graphics extends GraphicsProgram {
	
	public void run ()
	{
		// One Way:
		add( new GLabel("Hey.........", 10 , 10));
		
		//Second Way
		
		
		GLabel Label = new GLabel("Wish Me Good Luck........" , 100, 100);
		Label.setFont("Arial-30");
		Label.setColor(Color.BLUE);
		add(Label);
		
		GLabel Label2 = new GLabel("Thanks If You Did..........");
		Label2.setLocation(200,200);
		Label2.setFont("Arial-italic-30");
		Label2.setColor(Color.GREEN);
		add(Label2);
		
		GLabel Label3 = new GLabel("Cool...");
		Label3.setLocation(300,300);
		Label3.setFont("cambira-30");
		Label3.setColor(Color.GREEN);
		add(Label3);
		
		GLabel Label4 = new GLabel("This Is A Future Programmer.....");
		Label4.setLocation(50,50);
		Label4.setFont("cambira-30");
		Label4.setColor(Color.GREEN);
		add(Label4);
		
		GRect Rect = new GRect(1000,0,100,100);
		Rect.setFilled(true);
		Rect.setFillColor(Color.ORANGE);
		Rect.setColor(Color.black);
		add(Rect);
		
		GOval Oval = new GOval(1000,0,100,100);
		Oval.setFilled(true);
		Oval.setFillColor(Color.RED);
		Oval.setColor(Color.red);
		add(Oval);
		
		GLine Line = new GLine(0,100,100,100);
		Line.setColor(Color.RED);
		add(Line);
	}
	
}
