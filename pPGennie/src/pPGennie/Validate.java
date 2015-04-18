package pPGennie;


import javax.swing.JOptionPane;


public class Validate {
	private String password;
	private int count=0;
	private boolean correct = false;
	private static String enterPassword;
	public Validate(String password) {
		this.password = password;
		JOptionPane.showMessageDialog(null, "Replicate the generated password with in 3 attemps");
		while(count < 3 && correct!=true){
			enterPassword = JOptionPane.showInputDialog("Enter your generated password ");
			if(enterPassword.equals(password)){
					correct =true;
					JOptionPane.showMessageDialog(null, "Congrats! You've enter the correct password :)");
					break;
			}
			JOptionPane.showMessageDialog(null, "Sorry You've entered the wrong password :(");
			count++;
		}
			
	}
	

}