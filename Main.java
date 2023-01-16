import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите год:");
            int year = scanner.nextInt();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            if (isLeapYear(year)) {
                System.out.println(dtf.format(LocalDate.of(year, 9, 12)));
                // здесь нужно вывести результат
            } else if (year == 0) break;
            else System.out.println(dtf.format(LocalDate.of(year, 9, 13)));
        }
    }

    public static boolean isLeapYear(int year) {
        boolean result = false;
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) result = true;
        // здесь нужно определить, является ли переданный год високосным
        return result;
    }
}