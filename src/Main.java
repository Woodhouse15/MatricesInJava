
public class Main {

	public static void main(String[] args) {
		Matrix matrix1 = new Matrix();
		//new MatrixInput(matrix1).createGUI();
		int check = 0;
		new SelectorType(check).createSelectionIn();
		System.out.println(check);
	}

}
