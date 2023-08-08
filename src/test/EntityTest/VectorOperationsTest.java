package EntityTest;

import Entity.VectorOperations;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class VectorOperationsTest {

    @Test
    public void testCalculateProjection() {
        double[] u = {1.0, 2.0, 3.0};
        double[] v = {4.0, 5.0, 6.0};

        double[] expectedProjection = {1.662, 2.077, 2.493};
        double[] actualProjection = VectorOperations.calculateProjection(u, v);

        assertArrayEquals(expectedProjection, actualProjection, 0.001);
    }

    @Test
    public void testCalculateSubtraction() {
        double[] u = {1.0, 2.0, 3.0};
        double[] v = {4.0, 5.0, 6.0};

        double[] expectedSubtraction = {-3.0, -3.0, -3.0};
        double[] actualSubtraction = VectorOperations.calculateSubtraction(u, v);

        assertArrayEquals(expectedSubtraction, actualSubtraction, 0.001);
    }

    @Test
    public void testCalculateCrossProduct() {
        double[] u = {1.0, 2.0, 3.0};
        double[] v = {4.0, 5.0, 6.0};

        double[] expectedCrossProduct = {-3.0, 6.0, -3.0};
        double[] actualCrossProduct = VectorOperations.calculateCrossProduct(u, v);

        assertArrayEquals(expectedCrossProduct, actualCrossProduct, 0.001);
    }

    // Additional test cases can be added to cover different scenarios
}

