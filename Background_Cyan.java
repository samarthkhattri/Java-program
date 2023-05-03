import javax.swing.*;
import java.awt.*;
class Background_Cyan
{
    //Driver function
    public static void main(String args[])
    {
        //Create a frame
	JFrame frame = new JFrame("Cyan Text");
	frame.setSize(400,400);
	frame.setLayout(new FlowLayout());
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setBackground(Color.CYAN);
	//Write some text to the frame
	String str="The Background of Frame is Cyan";
	JLabel text = new JLabel(str);
	text.setFont(new Font("Serif",Font.ITALIC,20));
	frame.add(text);
	//Set Background Color of Text as red
	text.setForeground(Color.red);
	//Display the frame
	frame.setVisible(true);
    }
}











































/*import javax.swing.*;

import javax.awt.*;
public class Tsaw
{
	public static void main(String args[])
	{
	  JFrame first = new JFrame();
      first.setTitle("NEW FRAME");
	  first.setResizable(true);
	  first.setVisible(true);
	  first.setSize(420,480);
	  first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      first.ContentPane().setBackground(Color.RED); 


	
	}
	
	
}
*/ 
		