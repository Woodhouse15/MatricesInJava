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
		sc.close();
		matrix.SetOperation();
		matrix.PrintMatrix();
	}

}
