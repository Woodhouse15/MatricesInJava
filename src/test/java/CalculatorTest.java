import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

public class CalculatorTest {
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
}
