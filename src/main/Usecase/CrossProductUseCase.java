package Usecase;


import Entity.VectorOperations;

public class CrossProductUseCase {

    public double[] calculateCrossProduct(double[] u, double[] v) {
        return VectorOperations.calculateCrossProduct(u, v);
    }
}
