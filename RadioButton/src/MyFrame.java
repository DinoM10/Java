import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;


public class MyFrame extends JFrame implements ActionListener{
	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizzaButton = new JRadioButton("pizza");
		hamburgerButton = new JRadioButton("hamburger");
		hotdogButton = new JRadioButton("hotdog");
		
		ButtonGroup group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(hotdogButton);
		
		pizzaButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		hotdogButton.addActionListener(this);

		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(hotdogButton);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==pizzaButton) {
			System.out.println("You ordered pizza");
		}
		else if(e.getSource()==hamburgerButton) {
			System.out.println("You ordered hamburger");
		}
		else if (e.getSource()==hotdogButton){
			System.out.println("You ordered hotdog");
		}
	}
	}
	

