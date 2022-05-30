import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DimensionInput {
	private JTextField[] dimensions = new JTextField[2];
	private JLabel[] labels = new JLabel[2];
	private JFrame contentFrame = new JFrame("Dimension Input");
	private JPanel dimGUI = new JPanel();
	private JButton submitDim = new JButton("Submit");
	
	public DimensionInput(){
		
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
	public void createGui() {
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
				}
			}
		);
		contentFrame.pack();
		contentFrame.setVisible(true);
	}
}
