package Middle2;

import java.util.Scanner;

public class Human {
    public CheckCell checkCell;
    public char[][] receivedFrame;

    public Human(char[][] frame) {
        this.receivedFrame = frame;
        this.checkCell = new CheckCell(frame);
    }

    char human = 'X';

    public void humanTurn() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        do {
            System.out.println("Put in coordinates: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (checkCell.isCellInvalid(x, y));

            receivedFrame[y][x] = human;
    }
}
