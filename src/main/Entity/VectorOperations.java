package Entity;
public class VectorOperations {

    /**
     * Calculates the projection of vector u onto v
     * @param u
     * @param v
     * @return returns the projection as double[]
     */
    public static double[] calculateProjection(double[] u, double[] v) {
        double dotProduct = calculateDotProduct(u, v);
        double vMagnitudeSquared = calculateDotProduct(v, v);

        double scalar = dotProduct / vMagnitudeSquared;

        double[] projection = new double[u.length];
        for (int i = 0; i < u.length; i++) {
            projection[i] = scalar * v[i];
        }
        return projection;
    }


    public static double[] calculateSubtraction(double[] u, double[] v) {
        if (u.length != v.length) {
            throw new IllegalArgumentException("Vectors must have the same length.");
        }

        double[] subtraction = new double[u.length];
        for (int i = 0; i < u.length; i++) {
            subtraction[i] = u[i] - v[i];
        }
        return subtraction;
    }

    public static double[] calculateCrossProduct(double[] u, double[] v) {
        if (u.length != 3 || v.length != 3) {
            throw new IllegalArgumentException("Cross product is only defined for 3D vectors.");
        }

        double[] crossProduct = new double[3];
        crossProduct[0] = u[1] * v[2] - u[2] * v[1];
        crossProduct[1] = u[2] * v[0] - u[0] * v[2];
        crossProduct[2] = u[0] * v[1] - u[1] * v[0];
        return crossProduct;
    }

    private static double calculateDotProduct(double[] u, double[] v) {
        double dotProduct = 0;
        for (int i = 0; i < u.length; i++) {
            dotProduct += u[i] * v[i];
        }
        return dotProduct;
    }
}

