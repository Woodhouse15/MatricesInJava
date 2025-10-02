public class Calculator {
    public Matrix Addition(Matrix m1, Matrix m2){
        if(m1.size != m2.size){
            System.out.println("These matrices cannot be added, please make sure both matrices are the same size");
            return null;
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

    public Matrix subtraction(Matrix m1, Matrix m2){
        if(m1.size != m2.size){
            System.out.println("These matrices cannot be added, please make sure both matrices are the same size");
            return null;
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

    public int Determinant(Matrix m){
        if(m.size == 1) {
            return m.GetValue(0, 0);
        } else if (m.size == 2) {
            return (m.GetValue(0,0)*m.GetValue(1,1)) - (m.GetValue(0,1) * m.GetValue(1,0));
        }else{
            int det = 0;
            for(int col = 0; col < m.size; ++col){
                int[][] sub = new int[m.size - 1][m.size - 1];
                for(int i = 1; i < m.size; ++i){
                    int subc = 0;
                    for(int j = 0; j < m.size; ++j){
                        if(j == col){
                            continue;
                        }
                        sub[i-1][subc] = m.GetValue(i,j);
                        subc += 1;
                    }
                }
                int sign = (col % 2 == 0) ? 1 : -1;
                Matrix newm = new Matrix(m.size - 1);
                newm.matrix = sub;
                det += sign * m.GetValue(0,col) * Determinant(newm);
            }
            return det;
        }

    }

    public int Rank(Matrix m){
        return 0;
    }
}
