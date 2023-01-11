import java.util.Scanner;

public class SecondLesson {
    public void firstTask() {
        String newString = "";
        Scanner scanner = new Scanner(System.in);
        while (!newString.contains("Exit")) {
            System.out.println("Please enter something (enter 'Exit' to exit) (first task): ");
            newString = scanner.nextLine();
        }
    }

    public void secondTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number (second task): ");
        int x = scanner.nextInt();
        while (x < 0) {
            System.out.println("Please enter a positive number: ");
            x = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += i;
        }
        System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);
    }

    public void thirdTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your score (third task): ");
        int score = scanner.nextInt();
        while (score < 0 || score > 100) {
            System.out.println("Incorrect number. Enter correct number: ");
            score = scanner.nextInt();
        }
        if (score >= 70) {
            System.out.println("Congrats! You’ve passed the test!");
        } else {
            System.out.println("Sorry, you’ve failed the test.");
        }
    }

    public void fourthTask() {
        System.out.print("Select channel (fourth task): ");
        String[] channels = {"Turn off", "БТ", "ОНТ", "РТР", "ТНТ", "СТС", "Спорт", "Россия 1", "СТВ", "Discovery"};
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        while (x > 0) {
            System.out.println(channels[x]);
            x = scanner.nextInt();
            if (x == 0) break;
        }
    }

    public void additionalTask() {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String lastName = "";
        int dateOfBirth = 0;
        while (true) {
            System.out.println("Введите цифру для вызова пункта меню: 1. Ввести имя. 2. Ввести фамилию. 3. Ввести год рождения. 4. Вывести информацию. 0. Выход.");
            int x = scanner.nextInt();
            switch (x) {
                case 1 :
                    Scanner firstCase = new Scanner(System.in);
                    System.out.println("Введите имя: ");
                    name = firstCase.nextLine();
                    break;
                case 2 :
                    Scanner secondCase = new Scanner(System.in);
                    System.out.println("Введите фамилию: ");
                    lastName = secondCase.nextLine();
                    break;
                case 3 :
                    Scanner thirdCase = new Scanner(System.in);
                    System.out.println("Введите год рождения: ");
                    dateOfBirth = thirdCase.nextInt();
                    break;
                case 4 :
                    System.out.println("Имя: " + name + ", Фамилия: " + lastName + ", г.р.: " + dateOfBirth);
                    break;
                case 0 :
                    return;
                default :
                    break;
            }
        }
    }
}
