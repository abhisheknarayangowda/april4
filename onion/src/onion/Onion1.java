package onion;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.Event;
import java.awt.GridLayout;
import java.awt.TextField;

public class Onion1 extends Applet
{
	Checkbox c1,c2,c3,c4,c5,c6,c7,c8;
	TextField t;
	public void init()
	{
		setLayout(new GridLayout(5,1));
		add(c1= new Checkbox("1"));
		add(c2= new Checkbox("2"));
		add(c3= new Checkbox("3"));
		add(c4= new Checkbox("4"));
		add(c5= new Checkbox("5"));
		add(c6= new Checkbox("6"));
		add(c7= new Checkbox("7"));
		add(c8= new Checkbox("8"));
		add(t = new TextField(15));
		}
	public boolean action(Event e, Object o) {
	int sum = 0;
	if(c1.getState())
		sum=sum+1;
	if(c2.getState())
		sum=sum+2;
	if(c3.getState())
		sum=sum+3;
	if(c4.getState())
		sum=sum+4;
	if(c5.getState())
		sum=sum+5;
	if(c6.getState())
		sum=sum+6;
	if(c7.getState())
		sum=sum+7;
	if(c8.getState())
		sum=sum+8;
	t.setText(String.valueOf(sum));
	return true;
	
}
}
