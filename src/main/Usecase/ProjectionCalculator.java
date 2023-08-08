package Usecase;

import Controller.InputHandler;
import Presenter.OutputDisplay;

import java.util.Scanner;

public class ProjectionCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VectorFactory vectorFactory = (VectorFactory) new ConsoleVectorFactory(scanner);

        InputHandler inputHandler = new InputHandler(vectorFactory);

        double[] u = inputHandler.readVector(3); // 3D vector for cross product
        double[] v = inputHandler.readVector(u.length);

        inputHandler.closeScanner(scanner);

        ProjectionUseCase projectionUseCase = new ProjectionUseCase();
        double[] projection = projectionUseCase.calculateProjection(u, v);

        SubtractionUseCase subtractionUseCase = new SubtractionUseCase();
        double[] subtraction = subtractionUseCase.calculateSubtraction(u, v);

        CrossProductUseCase crossProductUseCase = new CrossProductUseCase();
        double[] crossProduct = crossProductUseCase.calculateCrossProduct(u, v);

        OutputDisplay.displayVector("Projection of vector u onto vector v:", projection);
        OutputDisplay.displayVector("Subtraction of vector v from vector u:", subtraction);
        OutputDisplay.displayVector("Cross product of vector u and vector v:", crossProduct);
    }
}
