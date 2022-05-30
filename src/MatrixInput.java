import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MatrixInput {
	Matrix matrix = new Matrix();
	private JTextField[][] matrixIn;
	private JFrame contentFrame = new JFrame("Matrix Input");
	private JPanel matrixGUI = new JPanel();
	private JButton submitMat = new JButton("Submit");
	private int row;
	private int col;
	public MatrixInput(Matrix in, int rows, int cols) {
		this.matrix = in;
		this.row = rows;
		this.col = cols;
	}
	
	public void createMatrixIn(int row, int col) {
		matrixGUI.setLayout(new GridLayout(row,col));
		matrix.setSize(row, col);
		matrixIn = new JTextField[row][col];
		for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
            	matrixIn[i][j] = new JTextField();
            	matrixGUI.add(matrixIn[i][j]);
            }
        }
		contentFrame.add(matrixGUI, BorderLayout.CENTER);
		contentFrame.add(submitMat, BorderLayout.SOUTH);
		submitMat.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						for(int i = 0; i < row; i++) {
				            for(int j = 0; j < col; j++) {
				            	matrix.setSquare(i, j, Integer.parseInt(matrixIn[i][j].getText()));
				            }
				        }
					}
				}
			);
	}
	public void createGUI() {
		contentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentFrame.setLayout(new BorderLayout(8,8));
		createMatrixIn(row,col);
		contentFrame.pack();
		contentFrame.setVisible(true);
	}
	public Matrix returnMatrix() {
		return matrix;
	}
}
