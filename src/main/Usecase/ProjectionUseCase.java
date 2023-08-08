package Usecase;

import Entity.VectorOperations;


public class ProjectionUseCase {

    /**
     * Invokes the calculation of projection between two vectors
     * @param u
     * @param v
     * @return
     */
    public double[] calculateProjection(double[] u, double[] v) {
        return VectorOperations.calculateProjection(u, v);
    }
}

