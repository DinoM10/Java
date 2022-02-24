import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	 JButton button;
	 MyFrame(){
		 
		 ImageIcon icon = new ImageIcon("12.png");
		 
		 button = new JButton();
		 button.setBounds(200,100,250,150);
		 button.addActionListener(this);
		 button.setText("I'm a button");
		 button.setFocusable(false);
		 button.setIcon(icon);
		 button.setHorizontalTextPosition(JButton.CENTER);
		 button.setVerticalTextPosition(JButton.BOTTOM);
		 button.setFont(new Font("Comis Sans", Font.BOLD,25));
		 button.setIconTextGap(10);
		 
		 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		 this.setLayout(null);
		 this.setSize(500,500); 
		 this.setVisible(true);
		 this.add(button);
		 
	 }

	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button){
			System.out.println("Click");
		}
	}
	}


