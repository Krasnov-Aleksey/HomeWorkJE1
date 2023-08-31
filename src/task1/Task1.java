package task1;

import java.util.Scanner;

public class Task1 {
//    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//    и возвращает введенное значение. Ввод текста вместо числа не должно приводить
//    к падению приложения, вместо этого, необходимо повторно запросить
//    у пользователя ввод данных.
    public void inputFloat(){
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        String number="";
        while (flag){
            System.out.println("Введите число");
            number = scanner.next();
            flag = isNumber(number);
        }
        System.out.println(number);
    }
    public boolean isNumber(String number){
        try {
            Float.parseFloat(number);
            return false;
        } catch (NumberFormatException e){
            return true;
        }
    }
}
