package Usecase;

import Entity.VectorOperations;


public class SubtractionUseCase {

    /**
     * Invokes the calculation of subtraction between two vectors
     * @param u
     * @param v
     * @return double[] representation of the resulting vector
     */
    public double[] calculateSubtraction(double[] u, double[] v) {
        return VectorOperations.calculateSubtraction(u, v);
    }
}

