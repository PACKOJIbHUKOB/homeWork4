public class Main {
    public static void main(String[] args) {   task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();}
    private static void task1() {
        System.out.println("задача 1");
        int age = 24, age2 = 16;
        if ( age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }else {System.out.println("Если возраст человека равен "+age+", то он не достиг совершеннолетия, нужно немного подождать");}
        if ( age2 >= 18) {
            System.out.println("Если возраст человека равен " + age2 + ", то он совершеннолетний");
        }else {System.out.println("Если возраст человека равен "+age2+", то он не достиг совершеннолетия, нужно немного подождать");}
    }
    private static void task2() {
        System.out.println("задача 2");
        int airTemperature = 7, airTemperature2 = 5;
        if (airTemperature <= 5) {
            System.out.println("На улице "+airTemperature+" градусов, нужно надеть шапку");}
        else{
            System.out.println("На улице "+airTemperature+" градусов, можно идти без шапки");
        }
        if (airTemperature2 <= 5) {
            System.out.println("На улице "+airTemperature2+" градусов, нужно надеть шапку");}
        else{
            System.out.println("На улице "+airTemperature2+" градусов, можно идти без шапки");
        }

    }
    private static void task3() {
        System.out.println("задача 3");
        int speed1 = 58, speed2 = 79;
        if (speed1 <= 60){
            System.out.println("Если скорость "+speed1+", томожно ездить спокойно.");}
        else {
            System.out.println("Если скорость "+speed1+", то придется заплатить штраф");}
        if (speed2 <= 60){
            System.out.println("Если скорость "+speed2+", томожно ездить спокойно.");}
        else {
            System.out.println("Если скорость "+speed2+", то придется заплатить штраф");}

    }
    private static void task4() {
        System.out.println("задача 4");}

    private static void task5() {
        System.out.println("задача 5");}

    private static void task6() {
        System.out.println("задача 6");}

    private static void task7() {
        System.out.println("задача 7");}

    private static void task8() {
        System.out.println("задача 8");}
}