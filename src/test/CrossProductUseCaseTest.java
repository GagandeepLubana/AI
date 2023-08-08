import Usecase.CrossProductUseCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CrossProductUseCaseTest {

    @Test
    public void testCalculateCrossProduct() {

        //Creates vector data
        double[] u = {1.0, 2.0, 3.0};
        double[] v = {4.0, 5.0, 6.0};

        //Creates expected output and actual output received
        double[] expectedCrossProduct = {-3.0, 6.0, -3.0};
        double[] actualCrossProduct = new CrossProductUseCase().calculateCrossProduct(u, v);

        //compares the expected and actual output
        assertArrayEquals(expectedCrossProduct, actualCrossProduct, 0.001);
    }
}

