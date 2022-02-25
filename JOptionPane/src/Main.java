import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {

		
		//JOptionPane.showMessageDialog(null, "This is some info", "title", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is some info", "title", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is some info", "title", JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is some info", "title", JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is some info", "title", JOptionPane.ERROR_MESSAGE);

		
		int answer = JOptionPane.showConfirmDialog(null, "this is some info", "title", JOptionPane.YES_NO_CANCEL_OPTION);
		String name = JOptionPane.showInputDialog("What is your name");
		System.out.println(name);
		
		JOptionPane.showOptionDialog(null, "You are ", "message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, 0);
	}

}
