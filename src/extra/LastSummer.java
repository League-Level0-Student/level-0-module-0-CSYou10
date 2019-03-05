package extra;

import javax.swing.JOptionPane;

public class LastSummer {
	public static void main(String[] args) {
		String t = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "I know that you jumped last summer " + t);
	}
}
