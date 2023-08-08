package Controller;

import Usecase.VectorFactory;

import java.util.Scanner;

public class InputHandler {

    private VectorFactory vectorFactory;

    public InputHandler(VectorFactory vectorFactory) {
        this.vectorFactory = vectorFactory;
    }

    /**
     * Reads for a valid vector and returns a representation of a vector
     * @param expectedSize
     * @return double[] a representation of 3D vector
     */
    public double[] readVector(int expectedSize) {
        try {
            double[] vector = vectorFactory.createVector(expectedSize);
            return vector;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Vector size mismatch. Expected: " + expectedSize);
        }


    }

    /**
     * Closes the scanner for inputs
     * @param scanner
     */
    public void closeScanner(Scanner scanner) {
        scanner.close();
    }
}

