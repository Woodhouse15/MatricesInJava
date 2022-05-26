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
	private JTextField[] dimensions = new JTextField[2];
	private JTextField[][] matrixIn;
	private JTextField[][] enter;
	private JLabel[] labels = new JLabel[2];
	private JFrame contentFrame = new JFrame("Matrix Input");
	private JPanel dimGUI = new JPanel();
	private JPanel matrixGUI = new JPanel();
	private JButton submitDim = new JButton("Submit");
	private JButton submitMat = new JButton("Submit");
	public MatrixInput() {
		
	}
	public void createDimInput() {
		//Creating the dimensions input
		dimGUI.setLayout(new GridLayout(4,1));
		for(int i = 0; i< dimensions.length;i++) {
			labels[i] = new JLabel();
			if(i==0) {
				labels[i].setText("Rows");
			}else {
				labels[i].setText("Cols");
			}
			dimGUI.add(labels[i]);
			dimensions[i] = new JTextField();
			dimGUI.add(dimensions[i]);
		}
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
	}
	public void createGUI() {
		createDimInput();
		contentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentFrame.setLayout(new BorderLayout(8,8));
		contentFrame.add(dimGUI, BorderLayout.CENTER);
		contentFrame.add(submitDim, BorderLayout.SOUTH);
		submitDim.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					int[] dim = new int[2];
					for(int i = 0; i < 2; i++) {
						dim[i] = Integer.parseInt(dimensions[i].getText());
					}
					
					contentFrame.remove(dimGUI);
					contentFrame.remove(submitDim);
					System.out.println(dim[1]);
					createMatrixIn(dim[0],dim[1]);
					contentFrame.add(submitMat, BorderLayout.SOUTH);
					contentFrame.revalidate();
	                contentFrame.repaint();
				}
			}
		);
		contentFrame.pack();
		contentFrame.setVisible(true);
	}
}
