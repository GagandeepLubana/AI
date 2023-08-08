package Usecase;

import Entity.VectorOperations;


public class SubtractionUseCase {

    public double[] calculateSubtraction(double[] u, double[] v) {
        return VectorOperations.calculateSubtraction(u, v);
    }
}

