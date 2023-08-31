package task4;

import java.util.Scanner;

public class Task4 {
//    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public void nullString(){
        Scanner scanner = new Scanner(System.in);
        String str = null;
        System.out.println("Введите текст");
        str = scanner.nextLine();
        if (str == null || str.isEmpty()){
            throw new RuntimeException("Текст не может быть пустым");
        }
    }
}
