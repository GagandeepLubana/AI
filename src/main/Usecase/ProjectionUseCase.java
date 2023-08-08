package Usecase;

import Entity.VectorOperations;


public class ProjectionUseCase {

    public double[] calculateProjection(double[] u, double[] v) {
        return VectorOperations.calculateProjection(u, v);
    }
}

