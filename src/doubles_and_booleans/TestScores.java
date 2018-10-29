package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String hi = JOptionPane.showInputDialog("What is your test score?");
		double test = Double.parseDouble(hi);
		if(test<=80.00) {
			JOptionPane.showMessageDialog(null, "Study more next time!!!!!!!!!!");
		}
		else if(test>=80.00) {
			JOptionPane.showMessageDialog(null, "Good job, you studied really hard!");
		}
				
		
	}

}
