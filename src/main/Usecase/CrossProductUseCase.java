package Usecase;


import Entity.VectorOperations;

public class CrossProductUseCase {

    /**
     * Invokes the cross product between two vectors
     * @param u
     * @param v
     * @return
     */
    public double[] calculateCrossProduct(double[] u, double[] v) {
        return VectorOperations.calculateCrossProduct(u, v);
    }
}
