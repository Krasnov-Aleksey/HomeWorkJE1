package task2;

import static java.lang.Double.POSITIVE_INFINITY;

public class Task2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            double [] intArray = {1,2,3,4,5,6,7,8,9};
            double catchedRes1 = intArray[8] / d;
            if(catchedRes1 == POSITIVE_INFINITY)
                throw new ArithmeticException("Infinity");
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }
    }
}
