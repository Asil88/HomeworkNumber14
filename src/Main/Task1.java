package Main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM.dd.yyyy");
try {
    LocalDate date = LocalDate.parse(sc.nextLine(),format);
    System.out.println(date.getDayOfWeek());
}catch (DateTimeParseException e){
    System.out.println("Errore,try again");
}











   /*     LocalDate date0 = LocalDate.of(2022,10,18);
        LocalDate date = LocalDate.now();
        System.out.println(date.plusDays(2));*/
    }
}
