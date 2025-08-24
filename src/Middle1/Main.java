package Middle1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Division division = new Division();
        Multiplication multiplication = new Multiplication();

        System.out.println(" Hello! Type the operation you want to do. \n '+' = addition \n '-' = substraction \n '/' = division \n '*' = multiplication");
        String inputCharacter = scanner.nextLine();
        System.out.println("Now type in the first argument");
        int a = scanner.nextInt();
        System.out.println("Type in the second argument");
        int b = scanner.nextInt();

        int result;
        if (inputCharacter.equals("+")) {
            result = addition.sum(a, b);
            System.out.println("Result of the addition: " + result);
        } else if (inputCharacter.equals("-")) {
            result = subtraction.sub(a, b);
            System.out.println("Result of the substraction: " + result);
        } else if (inputCharacter.equals("*")) {
            result = multiplication.multi(a, b);
            System.out.println("Result of the multiplication: " + result);
        } else if (inputCharacter.equals("/")) {
            result = division.div(a, b);
            System.out.println("Result of the division: " + result);
        }
    }
}
