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

    public boolean CheckZero(){
        for(int i = 0; i < this.size; i++){
            for(int j = 0; j < this.size; j++){
                if(GetValue(i,j) != 0){
                    return false;
                }
            }
        }
        return true;
    }

    public void PrintMatrix(){
        System.out.println(Arrays.deepToString(matrix));
    }

}
