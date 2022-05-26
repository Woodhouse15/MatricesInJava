public class Matrix {
	private int[][] matrix;
	
	public void setSize(int row, int col) {
		matrix = new int[row][col];
	}
	public int getSquare(int row, int col) {
		return matrix[row][col];
	}
	public void setSquare(int row, int col, int val) {
		matrix[row][col] = val;
	}
	public boolean isNull() {
		boolean valid = true;
		for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
            	if(getSquare(i,j) != 0) {
            		valid = false;
            		break;
            	}
            }
        }
		return valid;
	}
}
