public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1 () {
        System.out.println("Первая задача");
        int n = 10;
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
    public static void task2 () {
        System.out.println("Вторая задача");

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void task3 () {
        System.out.println("Третья задача");

        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
    public static void task4 () {
        System.out.println("Четвертая задача");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }
    public static void task5 () {
        System.out.println("Пятое задача (Високосные года)");

        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0) {
                System.out.println(i + " год является високосным");
            }
        }
    }
    public static void task6 () {
        System.out.println("Шестое задача (Вывод чисел)");

        for (int i = 7; i <= 98; i += 7) {
            System.out.print(" ");
            System.out.print(i);
        }
    }
    public static void task7 () {
        System.out.println();
        System.out.println("Седьмая задача");

        for (int i = 1; i <= 512; i += i) {
            System.out.print(" ");
            System.out.print(i);
        }
    }
    public static void task8 () {
        System.out.println();
        System.out.println("Восьмая задача (Банка)");

        int salary = 29_000;
        int salaryForYear = 0;



        for (int n = 0; n <= 12; n++) {
            salaryForYear += salary;

            System.out.println("За " + n + " месяц сумма накоплений равна " + salaryForYear + " рублей");
        }

    }
    public static void task9 () {
        System.out.println("Девятое задача (Банк с процентами)");

        double salary = 29_000;
        double pr = 12 / 100;

        double newSalaryPr = 0;


        for (int n = 1; n <= 12; n++) {
            newSalaryPr = (newSalaryPr + salary) * (1 + pr);
            System.out.println("За " + n + " месяц сумма накоплений равна " + newSalaryPr + " рублей");
        }


    }
    private static void task10() {
        System.out.println("Задача 10");

        int table = 0;

        for (int i = 1; i <= 10; i++) {
            table = i * 2;
            System.out.println("2 * " + i + " = " + table);
        }


    }
}