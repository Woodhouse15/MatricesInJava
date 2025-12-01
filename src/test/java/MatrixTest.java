import org.junit.Assert;
import org.junit.Test;
public class MatrixTest {
    @Test
    public void ZeroCheckerEmpty(){
        Matrix test = new Matrix(2);
        Assert.assertTrue(test.CheckZero());
    }

    @Test
    public void ZeroCheckerFull(){
        Matrix test = new Matrix(2);
        test.SetValue(1,1, 4.0f);
        Assert.assertFalse(test.CheckZero());
    }

}
