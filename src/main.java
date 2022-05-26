
public class Main {

	public static void main(String[] args) {
		Matrix matrix1 = new Matrix();
		MatrixInput one = new MatrixInput(matrix1);
		one.createGUI();
		matrix1.printMatrix();
	}

}
