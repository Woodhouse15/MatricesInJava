import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MyAction implements ActionListener{
	String m;
	public MyAction(String radioButtonLabel){
		m = radioButtonLabel;
	}
	public void actionPerformed(ActionEvent e){
		JOptionPane.showMessageDialog(null,"Your Selection is"+m+" radio button.");
	 }
}
