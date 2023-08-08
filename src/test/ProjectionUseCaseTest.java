


import Usecase.ProjectionUseCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ProjectionUseCaseTest {

    @Test
    public void testCalculateProjection() {

        //Creates vector data
        double[] u = {1.0, 2.0, 3.0};
        double[] v = {4.0, 5.0, 6.0};

        //Creates expected output and actual output received
        double[] expectedProjection = {1.662, 2.077, 2.493};
        double[] actualProjection = new ProjectionUseCase().calculateProjection(u, v);

        //compares the expected and actual output
        assertArrayEquals(expectedProjection, actualProjection, 0.001);
    }
}

