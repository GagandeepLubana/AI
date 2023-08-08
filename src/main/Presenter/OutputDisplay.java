package Presenter;


public class OutputDisplay {

    /**
     * displays the vector to the console
     * @param message
     * @param vector
     */
    public static void displayVector(String message, double[] vector) {
        System.out.println(message);
        System.out.print("[ ");
        for (double component : vector) {
            System.out.print(component + " ");
        }
        System.out.println("]");
    }
}

