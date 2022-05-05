import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MatrixCalc {
	static int row;
	static int col;

	JTextField[][] labels;
	JFrame selectionFrame = new JFrame();
	JFrame inputFrame = new JFrame();
	JPanel inputPanel = new JPanel();
	JFrame contentFrame = new JFrame();
	JPanel guiFrame = new JPanel();
	JTextField columns;
	JTextField rows;
	public static void main(String[] args) {
		new MatrixCalc().displayInputFields();
		
		//int[][] matrix = new int[row][col];
	}
	public void selection() {
		
	}
	public void displayInputFields() {
		inputFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inputFrame.setLayout(new BorderLayout(8,8));
		inputPanel.setLayout(new BoxLayout(inputPanel,BoxLayout.PAGE_AXIS));
		rows = new JTextField();
		rows.setBounds(0,0,20,20);
		JLabel one = new JLabel("Enter the rows:");
		columns = new JTextField();
		columns.setBounds(0,0,20,20);
		JLabel two = new JLabel("Enter the columns:");
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				submitButtonPressed();
			}
		});
		inputPanel.add(one);
		inputPanel.add(rows);
		inputPanel.add(two);
		inputPanel.add(columns);
		inputFrame.add(inputPanel,BorderLayout.CENTER);
		inputFrame.add(submit,BorderLayout.SOUTH);
		inputFrame.setPreferredSize(new Dimension(400, 300));
		inputFrame.pack();
		inputFrame.setVisible(true);
	}
	
	public void submitButtonPressed() {
		row = Integer.parseInt(rows.getText());
		col = Integer.parseInt(columns.getText());
		System.out.println("rows = "+row+", columns = "+col);
	}
	
	public void displayMatrixFields() {
		contentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentFrame.setLayout(new BorderLayout(8,8));
		guiFrame.setLayout(new GridLayout(8,8));
		contentFrame.add(guiFrame, BorderLayout.CENTER);
		contentFrame.setVisible(true);
	}
	/*
	public int[][] inputMatrix(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		row = scan.nextInt();
		System.out.println("Enter the number of columns");
		col = scan.nextInt();
		matrix = new int[row][col];
		System.out.println("Enter matrix data");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		return matrix;
	}
	*/

}
