
/**
 * Write a description of class Grid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Grid
{
    private char[][] board;

    public Grid()
    {
        board = new char[6][7];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                board[row][col] = ' ';
            }
        }
    }

    public void draw()
    {
        System.out.println("|1||2||3||4||5||6||7|");
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print("["+ board[row][col] +"]");
            }
            System.out.println(" ");
        }
    }

    public void drop(int row, int col) {
        for (int i = 0; (row + i < board.length - 1) && (board[row+i+1][col] == ' '); i++) {
            board[row+i+1][col] = board[row+i][col];
            board[row+i][col] = ' ';
        }
    }

    public void place(char player, int col) {
        board[0][col] = player;
    }

    public boolean winX() {
        return (checkRow('X') || checkCol('X') || checkDiagUpR('X') || checkDiagDownR('X'));
    }
    
    public boolean winY() {
        return (checkRow('Y') || checkCol('Y') || checkDiagUpR('Y') || checkDiagDownR('Y'));
    }
    
    public boolean checkRow(char symbol) {
        for(int i = 0; i < board.length; i++) {
            int streak = 0;
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == symbol) {
                    streak++;
                } else {
                    streak = 0;
                }
                if (streak >= 4)return true;
            }
        }
        return false;
    }

    public boolean checkCol(char symbol) {
        for (int j = 0; j < board[0].length; j++) {
            int streak = 0;
            for (int i = 0; i < board.length; i++) {
                if (board[i][j] == symbol) {
                    streak++;
                } else {
                    streak = 0;
                }
                if (streak >= 4)return true;
            }
        }
        return false;
    }

    public boolean checkDiagUpR(char symbol) {
        int iStart = 3;    
        int jStart = 0;
        while (jStart < 4) {
            int streak = 0;
            for (int i = iStart, j = jStart; i >= 0 && j < board[0].length; i--, j++) {
                if (board[i][j] == symbol) {
                    streak++;
                } else {
                    streak = 0;
                }
                if (streak >= 4) return true;
            }
            if (iStart < board.length-1) { 
                iStart++;
            } else {
                jStart++;
            }
        }
        return false;
    }
    
        public boolean checkDiagDownR(char symbol) {
        int iStart = 2;    
        int jStart = 0;
        while (jStart < 4) {
            int streak = 0;
            for (int i = iStart, j = jStart; i < board.length && j < board[0].length; i++, j++) {
                if (board[i][j] == symbol) {
                    streak++;
                } else {
                    streak = 0;
                }
                if (streak >= 4) return true;
            }
            if (iStart > 0) { 
                iStart--;
            } else {
                jStart++;
            }
        }
        return false;
    }

    public void round(int col, char symbol) {
        place(symbol, col);
        drop(0, col);
        draw();
    }
    
    public boolean validMove(int col) {
        if (col > 6 || col < 0) return false;
        if (board[0][col] != ' ') return false;
        return true;
    }
}
