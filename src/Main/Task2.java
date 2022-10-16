package Main;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfWeek().getValue());
        switch (date.getDayOfWeek().getValue()){
            case 1:date.plusDays(7);
                System.out.println(date);
            break;
            case 2:date.plusDays(6);
                System.out.println(date);
                break;
            case 3:date.plusDays(5);
                System.out.println(date);
                break;
            case 4:date.plusDays(4);
                System.out.println(date);
                break;
            case 5:date.plusDays(3);
                System.out.println(date);
                break;
            case 6:date.plusDays(2);
                System.out.println(date);
                break;
            case 7:date.plusDays(1);
                System.out.println(date);
                break;
        }
    }
}
