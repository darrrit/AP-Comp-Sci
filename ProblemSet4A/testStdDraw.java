public class testStdDraw {
    public static void main(String[] args) {
        StdDraw.setScale(0, 500);
        circles();
    }

    public static void grid() {
        for (int i = 0; i < 500; i += 20) {
            StdDraw.line(0, i, 500, i);
            StdDraw.line(i, 0, i, 500);
        }
    }

    public static void curve() {
        for (int i = 0; i < 500; i += 20) {
            StdDraw.line(500, i, i, 0);
            StdDraw.line(0, 500-i, 500-i, 500);
        }
    }

    public static void circles() {
        boolean EorO = true;
        for (int i = 360; i > 0; i -= 10) {
            if (!EorO) {
                StdDraw.filledCircle(500/2, 500/2, i);
            } else {
                StdDraw.circle(500/2, 500/2, i);
            }
            
        }
        EorO = !EorO;
    }
}