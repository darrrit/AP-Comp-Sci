
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
    
    public boolean win() {
        return (checkCol() || checkRow());
    }
    
    public boolean checkRow() {
        for(int i = 0; i < board.length; i++) {
            int streak = 0;
            for (int j = 0; j < board[0].length-1; j++) {
                if (board[i][j] == board[i][j+1] && board[i][j] != ' ') {
                    streak++;
                } else {
                    streak = 0;
                }
                if (streak >= 4) return true;
            }
        }
        return false;
    }
    
    public boolean checkCol() {
        for(int i = 0; i < board[0].length; i++) {
            int streak = 0;
            for (int j = 0; j < board.length-1; j++) {
                if (board[j][i] == board[j+1][i] && board[j][i] != ' ') {
                    streak++;
                } else {
                    streak = 0;
                }
                if (streak >= 4) return true;
            }
        }
        return false;
    }
    
    
    public void round(int col, int roundNum) {
        place(roundNum%2 == 0 ? 'X' : 'O', col);
        drop(0, col);
        draw();
    }
}
