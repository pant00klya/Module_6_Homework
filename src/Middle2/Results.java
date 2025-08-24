package Middle2;

public class Results {
    public char[][] receivedFrame;

    public Results(char[][] frame) {
        this.receivedFrame = frame;
    }

    public boolean checkDraft() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (receivedFrame[i][j] == '*') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkWin(char human) {
        //  0 1 2
        //0 * * *
        //1 * * *
        //2 * * *
            if (receivedFrame[0][0] == human && receivedFrame[0][1] == human && receivedFrame[0][2] == human) return true;
            if (receivedFrame[1][0] == human && receivedFrame[1][1] == human && receivedFrame[1][2] == human) return true;
            if (receivedFrame[2][0] == human && receivedFrame[2][1] == human && receivedFrame[2][2] == human) return true;

            if (receivedFrame[0][0] == human && receivedFrame[1][0] == human && receivedFrame[2][0] == human) return true;
            if (receivedFrame[0][1] == human && receivedFrame[1][1] == human && receivedFrame[2][1] == human) return true;
            if (receivedFrame[0][2] == human && receivedFrame[1][2] == human && receivedFrame[2][2] == human) return true;

            if (receivedFrame[0][0] == human && receivedFrame[1][1] == human && receivedFrame[2][2] == human) return true;
            if (receivedFrame[0][2] == human && receivedFrame[1][1] == human && receivedFrame[2][0] == human) return true;
            return false;
    }
}
