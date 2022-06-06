import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SelectorType{
	private JButton rank = new JButton("Rank");
	private JButton determinant = new JButton("Determinant");
	private JButton add = new JButton("Add");
	private JButton subtract = new JButton("Subtract");
	private JButton multiply = new JButton("Multiply");
	private JButton inverse = new JButton("Inverse");
	private JButton transpose = new JButton("Transpose");
	private JFrame contentFrame = new JFrame("Matrix Calculator Input");
	private JPanel gui = new JPanel();
	User user = new User();
	private int choice;
	
	public SelectorType(User in) {
		this.user = in;
		user.store(this);
	}
	public void createSelectionIn() {
		//Adding ActionListeners for each button
		rank.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						choice = 1;
						user.updateChoice();
						contentFrame.dispose();
					}
				}
			);
		determinant.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						choice = 2;
						user.updateChoice();
						contentFrame.dispose();
					}
				}
			);
		add.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						choice = 3;
						user.updateChoice();
						contentFrame.dispose();
					}
				}
			);
		subtract.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						choice = 4;
						user.updateChoice();
						System.exit(0);
					}
				}
			);
		multiply.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						choice = 5;
						user.updateChoice();
						contentFrame.dispose();
					}
				}
			);
		inverse.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						choice = 6;
						user.updateChoice();
						contentFrame.dispose();
					}
				}
			);
		transpose.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						choice = 7;
						user.updateChoice();
						contentFrame.dispose();
					}
				}
			);
		//Creating the gui
		BoxLayout box = new BoxLayout(gui, BoxLayout.Y_AXIS);
		gui.setLayout(box);
		gui.setSize(400,400);
		gui.add(add);
		gui.add(determinant);
		gui.add(inverse);
		gui.add(multiply);
		gui.add(rank);
		gui.add(subtract);
		gui.add(transpose);
		gui.setSize(300, 300);
		contentFrame.add(gui);
		contentFrame.setSize(400, 400);
		contentFrame.setVisible(true);
		contentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public int returnChoice() {
		return choice;
	}

}
