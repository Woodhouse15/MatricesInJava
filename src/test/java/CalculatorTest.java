import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

public class CalculatorTest {

	// Addition testing
	@Test
	public void AdditionTestNonMatching() {
		Matrix mat1 = new Matrix(2);
		Matrix mat2 = new Matrix(3);
		assertThrows(Exception.class, () -> Calculator.Addition(mat1,mat2));
	}

	@Test
	public void AdditionTestMatching() throws Exception {
		Matrix mat1 = new Matrix(3);
		Matrix mat2 = new Matrix(3);
		mat1.matrix = new float[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		mat2.matrix = new float[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		Matrix result = new Matrix(3);
		result.matrix = new float[][]{{2,4,6},{8,10,12},{14,16,18}};
		Assert.assertArrayEquals(result.matrix, Calculator.Addition(mat1,mat2).matrix);
	}

	// Subtraction testing
	@Test
	public void SubtractionTestNonMatching() {
		Matrix mat1 = new Matrix(2);
		Matrix mat2 = new Matrix(3);
		assertThrows(Exception.class, () -> Calculator.Subtraction(mat1,mat2));
	}

	@Test
	public void SubtractionTestMatching() throws Exception {
		Matrix mat1 = new Matrix(3);
		Matrix mat2 = new Matrix(3);
		mat1.matrix = new float[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		mat2.matrix = new float[][]{{2,4,6},{8,10,12},{14,16,18}};
		Matrix result = new Matrix(3);
		result.matrix = new float[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		Assert.assertArrayEquals(result.matrix, Calculator.Subtraction(mat2,mat1).matrix);
	}

	// Determinant testing
	@Test
	public void DeterminantOne(){
		Matrix matrix = new Matrix(3);
		matrix.matrix = new float[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		Assert.assertEquals(Calculator.Determinant(matrix), 0,0);
	}

	@Test
	public void DeterminantTwo(){
		Matrix matrix = new Matrix(4);
		matrix.matrix = new float[][]{{1,3,5,9},{1,3,1,7},{4,3,9,7},{5,2,0,9}};
		Assert.assertEquals(Calculator.Determinant(matrix),-376,0);
	}

	@Test
	public void DeterminantThree(){
		Matrix matrix = new Matrix(2);
		matrix.matrix = new float[][]{{3,2},{2,3}};
		Assert.assertEquals(Calculator.Determinant(matrix), 5,0);
	}
}
