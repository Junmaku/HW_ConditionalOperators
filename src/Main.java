public class Main {
    static void task1(int age) {
        String messageTask1 = "Если возраст человека равен ";
        String is18 = " он совершеннолетний";
        String isNot18 = " он не достиг совершеннолетия, нужно немного подождать";
        System.out.println(messageTask1 + age + (age >= 18 ? is18 : isNot18));
    }

    static void task2(double temp) {

        String messageTask2 = "На улице ";
        String isCold = ", нужно надеть шапку";
        String isWarm = ", можно идти без шапки";
        System.out.println(messageTask2 + temp + (temp < 5 ? isCold : isWarm));
    }

    static void task3(int speed) {
        if (speed < 0) System.out.println("Введите реальную скорость!");
        System.out.print("Если скорость " + speed);
        if (speed > 60) {
            System.out.println(", то придется заплатить штраф");
        } else {
            System.out.println(", можно ездить спокойно");
        }
    }

    static void task4(int age) {
        String institution = "";
        String messageTask4 = "";
        if (age < 2) {
            messageTask4 = age < 0 ? "Возраст не может быть отрицательным" : "Ребенок должен спать дом в кроватке";
        } else {
            if (age < 25) {
                institution = "в университет";
            } else {
                institution = "на работу";
            }
            if (age < 17) {
                institution = "в школу";
            }
            if (age < 7) {
                institution = "в детский сад";
            }
            messageTask4 = "Если возраст человека равен " + age + ", то ему нужно ходить " + institution;
        }
        System.out.println(messageTask4);
    }

    static void task5(int age) {
        String messageTask5 = "Если возраст ребенка равен " + age + ", то ему";
        String solution = "";
        if (age < 14) {
            solution = " можно кататься на аттракционе в сопровождении взрослого";
            if (age < 5) //Здесь одна операция
                solution = " нельзя кататься на аттракционах";
        } else solution = " можно кататься на аттракционах без сопровождения взрослого"; //Здесь тоже
        System.out.println(messageTask5 + solution);
    }

    static void task6(int place) {
        if (place < 102) {
            System.out.println(place > 60 ? "В вагоне есть " + (102 - place) + " стоячих мест" : "В вагоне есть " + (60 - place) + " сидячих мест и " + (102 - 60) + " стоячих мест");
        } else {
            System.out.println("Вагон полный. Мест нет");
        }
    }

    static void task7(int one, int two, int three) {
        System.out.println(Math.max(Math.max(one, two), three));
    }

    public static void main(String[] args) {
        //Task 1
        System.out.println("Задание 1:");
        task1(17);
        task1(18);
        task1(19);
        //Task 2
        System.out.println("Задание 2:");
        task2(4);
        task2(5);
        task2(6);
        //Task 3
        System.out.println("Задание 3:");
        task3(59);
        task3(60);
        task3(61);
        //Task 4
        System.out.println("Задание 4:");
        task4(-1);
        task4(1);
        task4(2);
        task4(7);
        task4(18);
        task4(25);
        //Task 5
        System.out.println("Задание 5:");
        task5(4);
        task5(10);
        task5(80);
        //Task 6
        System.out.println("Задание 6:");
        task6(14);
        task6(61);
        task6(103);
        //Task 7
        System.out.println("Задание 7:");
        task7(1, 3, 6);
        task7(-25, 55, 111144);
        task7(0, 0, 1);
    }
}