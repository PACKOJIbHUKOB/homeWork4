public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    private static void task1() {
        System.out.println("задача 1");
        int age = 24, age2 = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        if (age2 >= 18) {
            System.out.println("Если возраст человека равен " + age2 + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age2 + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    private static void task2() {
        System.out.println("задача 2");
        int airTemperature = 7, airTemperature2 = 5;
        if (airTemperature <= 5) {
            System.out.println("На улице " + airTemperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки");
        }
        if (airTemperature2 <= 5) {
            System.out.println("На улице " + airTemperature2 + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + airTemperature2 + " градусов, можно идти без шапки");
        }
    }

    private static void task3() {
        System.out.println("задача 3");
        int speed1 = 58, speed2 = 79;
        if (speed1 <= 60) {
            System.out.println("Если скорость " + speed1 + ", томожно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed1 + ", то придется заплатить штраф");
        }
        if (speed2 <= 60) {
            System.out.println("Если скорость " + speed2 + ", томожно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed2 + ", то придется заплатить штраф");
        }
    }

    private static void task4() {
        System.out.println("задача 4");
        int age = 1, age2 = 4, age3 = 8, age4 = 22, age5 = 39, age6 = 92;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать");
        } else if (age <= 2 || age > 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 || age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 18 || age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        } else if (age >= 24 || age < 60) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        } else if (age < 60) {
            System.out.println("Если возраст человека равен " + age + ", то он может отдохнуть");
        }
        if (age2 < 2) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему пора спать");
        } else if (age2>= 2 || age2 < 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад");
        } else if (age2 >= 7 || age2 < 18) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу");
        } else if (age2 >= 18 || age2 < 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то его место в университете");
        } else if (age2 >= 24 || age2 < 60) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему пора ходить на работу");
        } else if (age2 < 60) {
            System.out.println("Если возраст человека равен " + age2 + ", то он может отдохнуть");
        }
        if (age3 < 2) {System.out.println("Если возраст человека равен " + age3 + ", то ему пора спать");
        } else if (age3>2&&age3<6) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в детский сад");
        } else if (age3 >7&&age3<18) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в школу");
        } else if (age3 >= 18&&age3 < 24) {
            System.out.println("Если возраст человека равен " + age3 + ", то его место в университете");
        } else if (age3 >= 24&&age3 < 60) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему пора ходить на работу");
        } else if (age3 < 60) {
            System.out.println("Если возраст человека равен " + age3 + ", то он может отдохнуть");
        }
        if (age4 < 2) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему пора спать");
        } else if (age4 >= 2&&age4 < 6) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в детский сад");
        } else if (age4 >= 7&&age4 < 18) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в школу");
        } else if (age4 >= 18&&age4 < 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то его место в университете");
        } else if (age4 >= 24&&age4 < 60) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему пора ходить на работу");
        } else if (age4 < 60) {
            System.out.println("Если возраст человека равен " + age4 + ", то он может отдохнуть");
        }
        if (age5<2) {System.out.println("Если возраст человека равен " + age5 + ", то ему пора спать");
        } else if (age5 >= 2&&age5 < 6) {
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в детский сад");
        } else if (age5 >= 7&&age5 <18) {
            System.out.println("Если возраст человека равен " + age5 + ", то ему нужно ходить в школу");
        } else if (age5 >= 18&&age5< 24) {
            System.out.println("Если возраст человека равен " + age5 + ", то его место в университете");
        } else if (age5 >= 24&&age5 < 60) {
            System.out.println("Если возраст человека равен " + age5 + ", то ему пора ходить на работу");
        } else if (age5 > 60) {
            System.out.println("Если возраст человека равен " + age5 + ", то он может отдохнуть");
        }
        if (age6 < 2) {
            System.out.println("Если возраст человека равен " + age6 + ", то ему пора спать");
        } else if (age6 <= 2&&age6 < 6) {
            System.out.println("Если возраст человека равен " + age6 + ", то ему нужно ходить в детский сад");
        } else if (age6 <= 7&&age6 < 18) {
            System.out.println("Если возраст человека равен " + age6 + ", то ему нужно ходить в школу");
        } else if (age6 < 18&&age6 < 24) {
            System.out.println("Если возраст человека равен " + age6 + ", то его место в университете");
        } else if (age6 < 24&&age6 < 60) {
            System.out.println("Если возраст человека равен " + age6 + ", то ему пора ходить на работу");
        } else if (age6> 60) {
            System.out.println("Если возраст человека равен " + age6 + ", то он может отдохнуть");
        }
    }
    private static void task5() {
        System.out.println("задача 5");
        int age = 4, age2 = 10, age3 = 15;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему нельзя кататься на аттракционе.");
        } else if (age2 >= 5 && age2 < 14) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (age2 > 14) {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        if (age3 < 5) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на аттракционе.");
        } else if (age3 >= 5 && age3 < 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (age3 > 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
        private static void task6() {
            System.out.println("задача 6");
            int seatsOccupied = 102, seatsOccupied2 = 65, seatsOccupied3 = 50;
            int totalSeats = 102;
            int seating = 60;
            if (seatsOccupied >= totalSeats) {
                System.out.println("занято "+seatsOccupied+" места. В вагоне нет свободных мест");
            } else if (seatsOccupied > seating && seatsOccupied < totalSeats) {
                System.out.println("занято "+seatsOccupied+" мест. В вагоне остались только стоячие места");
            } else {
                System.out.println("занято "+seatsOccupied+" мест. В вагоне есть сидячие места");
            }
            if (seatsOccupied2 >= totalSeats) {
                System.out.println("занято "+seatsOccupied2+" мест. В вагоне нет свободных мест");
            } else if (seatsOccupied2 > seating && seatsOccupied2 < totalSeats) {
                System.out.println("занято "+seatsOccupied2+" мест. В вагоне остались только стоячие места");
            } else {
                System.out.println("занято "+seatsOccupied2+" мест. В вагоне есть сидячие места");
            }
            if (seatsOccupied3 >= totalSeats) {
                System.out.println("занято "+seatsOccupied3+" мест. В вагоне нет свободных мест");
            } else if (seatsOccupied3 > seating && seatsOccupied3 < totalSeats) {
                System.out.println("занято "+seatsOccupied3+" мест. В вагоне остались только стоячие места");
            } else {
                System.out.println("занято "+seatsOccupied3+" мест. В вагоне есть сидячие места");
            }
        }
    private static void task7() {
        System.out.println("задача 7");
        int one =5, two =5, three = 5;
        if (one>two&&one>three){
            System.out.println( one+ " самое большее число");
        } else if (two>one&&two>three) {
            System.out.println(two+ " самое большее число");}
        else if (one==two&&two==three) {
            System.out.println("все числа равны");

        } else {
            System.out.println(three+ " самое большее число");}
        }
    }