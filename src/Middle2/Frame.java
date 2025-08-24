package Middle2;

public class Frame {

    public char[][] frame;

    public Frame() {
        frame = new char[3][3];
    }

    public void initFrame() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                frame[i][j] = '*';
            }
        }
    }


    public void printFrame() {
        System.out.println(" ");
        for (int i = 0; i <= 3; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(frame[i][j] + " ");
            }
            System.out.println();
        }
    }
}
