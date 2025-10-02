import java.util.Arrays;
import java.util.Scanner;

public class Matrix{
    int[][] matrix;
    int size;
    public Matrix(int size){
        this.size = size;
        matrix = new int[size][size];
    }

    public void SetValue(int row, int column, int value){
        matrix[row][column] = value;
    }

    public int GetValue(int row, int column){
        return matrix[row][column];
    }

    public void PrintMatrix(){
        System.out.println(Arrays.deepToString(matrix));
    }

    public void SetOperation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select operation:\n1) Calculate Rank\n2) Calculate Determinant\n3) Calculate the transpose\n4) Invert matrix\n5) Add matrix\n 6) Subtract matrix\n7) Multiply matrix");
        int operation = sc.nextInt();
        while(operation < 1 || operation > 7){
            System.out.println("Invalid operation");
            System.out.println("Select operation:\n1) Calculate Rank\n2) Calculate Determinant\n3) Calculate the transpose\n4) Invert matrix\n5) Add matrix\n 6) Subtract matrix\n7) Multiply matrix");
            operation = sc.nextInt();
        }
        sc.close();
        System.out.println(operation);
    }
}
