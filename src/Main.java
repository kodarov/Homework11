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
    public static void task2(){
        System.out.println("Задание 2");
    }
    public static void task3(){
        System.out.println("Задание 3");
    }
}