import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the matrix");
		int size = sc.nextInt();
		Matrix matrix = new Matrix(size);
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				System.out.printf("Enter value for array[%d][%d]: ", i, j);
				matrix.SetValue(i,j,sc.nextInt());
			}
		}
		System.out.println("Select operation:\n1) Calculate Rank\n2) Calculate Determinant\n3) Calculate the transpose\n4) Invert matrix\n5) Add matrix\n 6) Subtract matrix\n7) Multiply matrix");
		int operation = sc.nextInt();
		while(operation < 1 || operation > 7){
			System.out.println("Invalid operation");
			System.out.println("Select operation:\n1) Calculate Rank\n2) Calculate Determinant\n3) Calculate the transpose\n4) Invert matrix\n5) Add matrix\n6) Subtract matrix\n7) Multiply matrix");
			operation = sc.nextInt();
		}
		matrix.PrintMatrix();
		Calculator calculator = new Calculator();
		switch(operation){
			case 1:
				System.out.println(calculator.Rank(matrix));
				break;
			case 2:
				System.out.println(calculator.Determinant(matrix));
				break;
			case 3:
				calculator.Transpose(matrix).PrintMatrix();
				break;
			case 4:
				calculator.Invert(matrix);
				break;
			default:
				System.out.println("Not implemented yet");
		}
	}
}
