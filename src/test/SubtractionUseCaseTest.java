
import Usecase.SubtractionUseCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SubtractionUseCaseTest {

    @Test
    public void testCalculateSubtraction() {

        //Creates vector data
        double[] u = {1.0, 2.0, 3.0};
        double[] v = {4.0, 5.0, 6.0};

        //Creates expected output and actual output received
        double[] expectedSubtraction = {-3.0, -3.0, -3.0};
        double[] actualSubtraction = new SubtractionUseCase().calculateSubtraction(u, v);

        //compares the expected and actual output
        assertArrayEquals(expectedSubtraction, actualSubtraction, 0.001);
    }
}

