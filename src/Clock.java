import java.util.*;

import javax.swing.*;

import java.awt.*;
import java.text.SimpleDateFormat;

class MyFrame extends JFrame
{
  Calendar calendar;
  SimpleDateFormat timeFormat;
  SimpleDateFormat dayFormat;
  SimpleDateFormat dateFormat;
  JLabel dateLabel;
  JLabel timeLabel;
  JLabel dayLabel;
  String time;
  String day;
  String date;
  
   public MyFrame()
   {
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   this.setTitle("My Clock Program");
	   this.setLayout(new FlowLayout());
	   this.setSize(350,200);
	   this.setResizable(true);
	   
	   timeFormat=new SimpleDateFormat("hh:mm:ss a");
	   dayFormat=new SimpleDateFormat("EEEE");
	   dateFormat=new SimpleDateFormat("MMMMM dd, yyyy");
	   
	   timeLabel=new JLabel();
	   
	   
	   time=timeFormat.format(Calendar.getInstance().getTime());
	   timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
	   timeLabel.setForeground(new Color(0x00F00));
	   timeLabel.setBackground(Color.white);
	   timeLabel.setOpaque(true);
	    
	   dayLabel=new JLabel();
	   dayLabel.setFont(new Font("Ink Free",Font.PLAIN,35));
	   
	   
	   dateLabel=new JLabel();
	   dateLabel.setFont(new Font("Ink Free",Font.PLAIN,25));
	   
	   
	   
	   this.add(timeLabel);
	   this.add(dayLabel);
	   this.add(dateLabel);
	   this.setVisible(true);
	   
	   setTime();
   }

   public void setTime()
   {
	   while(true)
	   {
	   time=timeFormat.format(Calendar.getInstance().getTime());
	   timeLabel.setText(time);
	   
	   day=dayFormat.format(Calendar.getInstance().getTime());
	   dayLabel.setText(day);
	   
	   
	   date=dateFormat.format(Calendar.getInstance().getTime());
	   dateLabel.setText(date);
	   
	   try 
	   {
		   Thread.sleep(1000);
	   }
	   catch(InterruptedException e)
	   {
		   e.printStackTrace();
	   }
	   
	   }
   }
   
}



public class Clock
{
	public static void main(String [] args)
	{
		MyFrame obj= new MyFrame();
	}
}

