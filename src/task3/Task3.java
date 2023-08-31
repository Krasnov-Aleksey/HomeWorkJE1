package task3;

public class Task3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b =3 ;
            System.out.println(a / b);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (ArithmeticException ex){
            System.out.println("На 0 делить нельзя");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        } finally {
            printSum(23, 234);
        }

    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}
