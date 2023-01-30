import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static boolean checkLeapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
           return true;
        } else return false;
    }
    public static void task1() {
        System.out.println("Задание 1");
        System.out.println("Год" + (checkLeapYear(2022)?" ":" не ") + "високосный");
    }

    public static void definitionApp(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear < LocalDate.now().getYear()) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченное приложение с App Store");
                    break;
                case 1:
                    System.out.println("Установите облегченное приложение с Google Store");
                    break;
                default:
                    System.out.println("Телефон не поддерживается");
            }
        } else {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите приложение с App Store");
                    break;
                case 1:
                    System.out.println("Установите приложение с Google Store");
                    break;
                default:
                    System.out.println("Телефон не поддерживается");
            }
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        definitionApp(0, 2015);
    }

    public static int calcDistance(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else return -1;
    }

    public static void displayDeliveryDays(int deliveryDistance) {
        if (deliveryDistance == -1) {
            System.out.println("Доставки нет");
        } else System.out.println("Потребуется дней: " + deliveryDistance);
    }

    public static void task3() {
        System.out.println("Задание 3");
        displayDeliveryDays(calcDistance(99));

    }
}