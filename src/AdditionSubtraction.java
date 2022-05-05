import java.util.Scanner;

public class AdditionSubtraction {

	public static void main(String[] args) {
		int[][] matrix1;
		int[][] matrix2;
		int choice;
		System.out.println("enter the first matrix");
		matrix1 = inputMatrix();
		System.out.println("enter the second matrix");
		matrix2 = inputMatrix();
		Scanner scan = new Scanner(System.in);
		System.out.println("1 for addition, 2 for subtraction");
		choice = scan.nextInt();
		if(choice == 1) {
			addition(matrix1,matrix2);
		}if(choice == 2) {
			subtraction(matrix1,matrix2);
		}
	}
	public static int[][] inputMatrix(){
		int[][] matrix;
		int row;
		int col;
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
	public static void subtraction(int[][] matrix1, int[][] matrix2) {
		
	}
	public static void addition(int[][] matrix1, int[][] matrix2) {
		
	}
}
