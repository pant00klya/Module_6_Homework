package Middle2;

public class CheckCell {
    public char[][] receivedFrame;

    public CheckCell(char[][] frame) {
        this.receivedFrame = frame;
    }

    public boolean isCellInvalid(int x, int y) {
        if (x < 0 || y < 0 || x >= 3 || y >= 3) {
            return true;
        }
        if (receivedFrame[y][x] != '*' ) {
            return true;
        }
        return false;
    }
}
