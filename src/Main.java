import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void calcLeapYear(int year) {
        if ((year % 4)>0 || (year%100) == 0) {
            System.out.println(year +" год не високосный");
        }
        else System.out.println(year +" год високосный");
    }
    public static void task1(){
        System.out.println("Задание 1");
        int nowYear = 2022;
        calcLeapYear(nowYear);
    }
    public static void definitionApp(int clientOS,int clientDeviceYear){
        if (clientDeviceYear < 2015) {
            switch (clientOS){
                case 0: System.out.println("Установите облегченное приложение с App Store"); break;
                case 1: System.out.println("Установите облегченное приложение с Google Store"); break;
                default: System.out.println("Телефон не поддерживается");}
        } else {
            switch (clientOS){
                case 0: System.out.println("Установите приложение с App Store"); break;
                case 1: System.out.println("Установите приложение с Google Store"); break;
                default: System.out.println("Телефон не поддерживается");}
        }
    }
    public static void task2(){
        System.out.println("Задание 2");
        int clientOS = 0; //(0 — iOS, 1 — Android)
        int clientDeviceYear = 2014;
        definitionApp(clientOS,clientDeviceYear);
        int currentYear = LocalDate.now().getYear();
        definitionApp(clientOS,currentYear);
    }
    public static int calcDistance(int deliveryDistance){
        int deliveryDay = 1;
        if (deliveryDistance <= 20) System.out.println("Потребуется дней: " + deliveryDay);
        else if (deliveryDistance <= 60) {
            deliveryDay=deliveryDay+1;
        }
        else if (deliveryDistance <= 100) {
            deliveryDay=deliveryDay+2;
        }
        else System.out.println("Доставки нет");
        return deliveryDay;
    }
    public static void task3(){
        System.out.println("Задание 3");
        int deliveryDistance = 950;
        calcDistance(deliveryDistance);

    }
}