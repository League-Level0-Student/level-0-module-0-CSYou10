package extra;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String response = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Hello " + response);

	}
}
