import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		
		ImageIcon image = new ImageIcon("123.png");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		
		JLabel label = new JLabel();
		label.setText("Text goes here");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0,150,255));
		label.setFont(new Font("MV Boli", Font.PLAIN,20));
		label.setIconTextGap(-25 );
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);

		JFrame frame = new JFrame();
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setSize(850,678);
		 frame.setVisible(true);
		 frame.add(label);
	}

}
