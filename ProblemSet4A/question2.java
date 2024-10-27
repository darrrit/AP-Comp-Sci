public class question2 {
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
        for (int i = 1; i < 50; i ++) {
            if (i%2 == 1) {
                StdDraw.setPenColor(StdDraw.WHITE);
            } else {
                StdDraw.setPenColor(StdDraw.BLACK);
            }
            StdDraw.filledCircle(500/2, 500/2, 500-i*10);
        }
    }
}