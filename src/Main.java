import java.time.LocalDate;

public class Main {
    public static void checkIsYearLeap(int auditedYear) {
        if ((auditedYear % 4 == 0) && (auditedYear % 100 != 0) || (auditedYear % 400 == 0)) {
            System.out.println(auditedYear + " год является високосным");
        } else {
            System.out.println(auditedYear + " год не является високосным");
        }
    }

    public static void determineAppVersion(int os, int deviceYear) {
        if (os == 0 && deviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (os == 0 && deviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if ( os == 1 && deviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (os == 1 && deviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int calculateDeliveryTime(int deliveryDistance) {
        int days = 0;
        if (deliveryDistance < 20) {
            days += 1;
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            days += 2;
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            days += 3;
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет");
        }
        return days;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int year = 1999;
        checkIsYearLeap(year);

    }
    public static void task2() {
        System.out.println("Задание 2");
        int currentYear = LocalDate.now().getYear();
        int clientOS = 1;
        determineAppVersion(clientOS, currentYear);
    }
    public static void task3() {
        System.out.println("Задание 3");
        int distance = 40;
        int days = calculateDeliveryTime(distance);
        System.out.println(days);

    }
}