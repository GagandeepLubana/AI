package ControllerTest;

import Controller.InputHandler;
import Usecase.ConsoleVectorFactory;
import Usecase.VectorFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InputHandlerTest {

    private InputHandler inputHandler;

    @BeforeEach
    public void setUp() {
        // Prepare a sample input stream with predefined values
        String input = "1.0 2.0 3.0";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(inputStream);

        VectorFactory vectorFactory = new ConsoleVectorFactory(scanner);
        inputHandler = new InputHandler(vectorFactory);
    }

    @Test
    public void testReadVector() {
        double[] expectedVector = {1.0, 2.0, 3.0};
        double[] actualVector = inputHandler.readVector(3);

        assertArrayEquals(expectedVector, actualVector, 0.001);
    }

}

