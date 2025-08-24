package Middle2;

public class Computer {
    public CheckCell checkCell;
    public char [][] receivedFrame;
    char computer = 'O';

    public Computer(char[][] frame) {
        this.receivedFrame = frame;
        this.checkCell = new CheckCell(frame);
    }

    public void computerTurn() {
        int x;
        int y;

        System.out.println("Computer turn");
        do {
            x = (int) (Math.random() * 3);
            y = (int) (Math.random() * 3);
        } while (checkCell.isCellInvalid(x, y));
        receivedFrame[y][x] = computer;
    }
}
