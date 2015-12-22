import javax.swing.*;
import java.awt.*; //New Stuff!

import java.awt.event.*;
import java.awt.event.ActionEvent;

public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JLabel j;
    private JButton b;
    private JRadioButton c;
    private JRadioButton f;
    private JSlider s;

    private void Window() {
	this.setTitle("Temperature Converter");
	this.setSize(6000,4000);
	this.setLocation(300,300);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	pane = this.getContentPane();
	pane.setLayout(new FlowLayout() );
	
	JButton b = new JButton("Convert");
	pane.add(b);
       	b.addActionListener(this);
	//	b.setACtionListener("Byte");

	JRadioButton c = new JRadioButton("Convert F to C");
	pane.add(c);

	JRadioButton f = new JRadioButton("Convert C to F");
	pane.add(f);
	
	JSlider s = new JSlider(JSlider.HORIZONTAL,-200,200,0);
	pane.add(s);
	
    }
    
    public void actionPerformed(ActionEvent e) {
	System.out.println("Converting...");
	
	if (c.isSelected() ) {
	    System.out.println( FtoC() );
	}
	else if (f.isSelected() ) {
	    System.out.println( CtoF() );
	}

	//if(event.equals("Byte")) {
	//  j.setText("NomNom");
	//}
    }

    public String FtoC(){
	int fc = ( (int)s.getValue() - 32) * 5/9;
	return "This is your converted value: " + fc;
    }

    public String CtoF(){
	int cf = ( (int)s.getValue() * 9/5) + 32;
	return "This is your converted value: " + cf;

    }
}