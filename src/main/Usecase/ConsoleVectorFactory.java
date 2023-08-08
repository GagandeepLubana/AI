package Usecase;

import java.util.Scanner;

// Implementation of VectorFactory using console input
public class ConsoleVectorFactory implements VectorFactory {

    private Scanner scanner;

    public ConsoleVectorFactory(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public double[] createVector(int size) {
        System.out.println("Enter the components of the vector (separated by spaces):");
        String input = scanner.nextLine();
        String[] components = input.split(" ");
        double[] vector = new double[size];
        for (int i = 0; i < size; i++) {
            vector[i] = Double.parseDouble(components[i]);
        }
        return vector;
    }
}
