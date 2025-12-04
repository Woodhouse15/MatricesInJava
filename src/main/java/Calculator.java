public class Calculator {

    public static Matrix Addition(Matrix m1, Matrix m2) throws Exception {
        if(m1.size != m2.size){
            throw new Exception("These matrices cannot be added, please make sure both matrices are the same size");
        }else{
            Matrix result = new Matrix(m1.size);
            for(int i = 0; i < m1.size; i++){
                for(int j = 0; j < m1.size; j++){
                    result.SetValue(i,j, (m1.GetValue(i,j) + m2.GetValue(i,j)));
                }
            }
            return result;
        }
    }

    public static Matrix Subtraction(Matrix m1, Matrix m2) throws Exception {
        if(m1.size != m2.size){
            throw new Exception("These matrices cannot be subtracted, please make sure both matrices are the same size");
        }else{
            Matrix result = new Matrix(m1.size);
            for(int i = 0; i < m1.size; i++){
                for(int j = 0; j < m1.size; j++){
                    result.SetValue(i,j, (m1.GetValue(i,j) - m2.GetValue(i,j)));
                }
            }
            return result;
        }
    }

    public static float Determinant(Matrix m){
        if(m.size == 1) {
            return m.GetValue(0, 0);
        } else if (m.size == 2) {
            return (m.GetValue(0,0)*m.GetValue(1,1)) - (m.GetValue(0,1) * m.GetValue(1,0));
        }else{
            float det = 0;
            for(int col = 0; col < m.size; ++col){
                Matrix sub = new Matrix(m.size -1);
                for(int i = 1; i < m.size; ++i){
                    int subc = 0;
                    for(int j = 0; j < m.size; ++j){
                        if(j == col){
                            continue;
                        }
                        sub.SetValue(i-1,subc, m.GetValue(i,j));
                        subc += 1;
                    }
                }
                int sign = (col % 2 == 0) ? 1 : -1;
                det += sign * m.GetValue(0,col) * Determinant(sub);
            }
            return det;
        }

    }

    public Matrix Minor(Matrix m, int row, int col){
        Matrix newM = new Matrix(m.size - 1);
        int mi = 0;
        int mj = 0;
        for(int i = 0; i < m.size; i++){
            if(i == row){
                continue;
            }
            for(int j = 0; j < m.size; j++){
                if(j == col){
                    continue;
                }
                newM.SetValue(mi,mj,m.GetValue(i,j));
                if(mi == newM.size - 1){
                    mi = 0;
                    mj ++;
                }else{
                    mi ++;
                }
            }
        }
        return newM;
    }

    public int Rank(Matrix m){
        int rank = 0;
        if(m.CheckZero()){
            return 0;
        }
        Matrix matrix = this.GaussianElim(m);
        for(int i = 0; i < matrix.size; i++){
            for(int j = 0; i < matrix.size; j++){
                if(matrix.GetValue(i,j) != 0){
                    rank++;
                    break;
                }
            }
        }
        return rank;
    }

    public Matrix Identity(Matrix m){
        Matrix matrix = new Matrix(m.size);
        for(int i = 0; i < m.size; i++){
            matrix.SetValue(i,i,1);
        }
        return matrix;
    }

    public Matrix GaussianElim(Matrix m){

        return m;
    }

    public Matrix SwapRow(Matrix matrix, int i, int j){
        for(int k = 0; k <= matrix.size; k++){
            float temp = matrix.GetValue(i,k);
            matrix.SetValue(i,k, matrix.GetValue(j,k));
            matrix.SetValue(j,k,temp);
        }
        return matrix;
    }

    public Matrix MultRow(Matrix matrix, int i, int scalar){
        for(int j = 0; j < matrix.size; j++){
            matrix.SetValue(i,j, matrix.GetValue(i,j) * scalar);
        }
        return matrix;
    }

    public Matrix Transpose(Matrix m){
        Matrix newMatrix = new Matrix(m.size);
        for(int i = 0; i < m.size; i++){
            for(int j = 0; j < m.size; j++){
                newMatrix.SetValue(j,i,m.GetValue(i,j));
            }
        }
        return newMatrix;
    }

    public Matrix Invert(Matrix m){
        return new Matrix(0);
    }

}
