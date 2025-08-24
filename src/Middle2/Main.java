package Middle2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Let's play Tic-Tac-Toe. What is your name?");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + ". Now let's play a game. You play X. Computer plays O. You first! ");

        Frame frame = new Frame();
        Human humanTurn = new Human(frame.frame);
        Computer computerTurn = new Computer(frame.frame);
        Results results = new Results(frame.frame);

        frame.initFrame();
        frame.printFrame();

        while (true) {
            humanTurn.humanTurn();
            frame.printFrame();

            if (results.checkWin('X')) {
                System.out.println("Game has finished. You won!");
                break;
            }
            if (results.checkDraft()) {
                System.out.println("Game has finished! You have a draft!");
                break;
            }

            computerTurn.computerTurn();
            frame.printFrame();

            if (results.checkWin('O')) {
                System.out.println("Game has finished. Computer won!");
                break;
            }
            if (results.checkDraft()) {
                System.out.println("Game has finished! You have a draft!");
                break;
            }
        }
    }
}

