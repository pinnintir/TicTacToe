public class TicTacToeClass {


    private char[][] board;
    private int turns;

    public TicTacToeClass() {
        board = new char[3][3];
        turns = 0;

        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public boolean isWinner( char p ) {
        if (this.board[0][0] == p && this.board[0][1] == p && this.board[0][2] == p)
            return true;
        if (this.board[1][0] == p && this.board[1][1] == p && this.board[1][2] == p)
            return true;
        if (this.board[2][0] == p && this.board[2][1] == p && this.board[2][2] == p)
            return true;
        if (this.board[1][0] == p && this.board[2][0] == p && this.board[0][0] == p)
            return true;
        if (this.board[1][1] == p && this.board[0][1] == p && this.board[2][1] == p)
            return true;
        if (this.board[1][2] == p && this.board[0][2] == p && this.board[2][2] == p)
            return true;
        if (this.board[0][0] == p && this.board[1][1] == p && this.board[2][2] == p)
            return true;
        if(this.board [0][2] == p && this.board [1][1] == p && this.board [2][0] == p)
            return true;
        else return false;
    }

    public boolean isFull() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (this.board[r][c] == ' ') {
                    return false;
                }
            }
        }
            return true;
    }

    public boolean isCat()
        {if(this.turns == 9 && !this.isWinner('X') && !this.isWinner('O'))
        return true;
            else{
            return false;
        }
        }

    public boolean isValid( int r, int c )
    {
        if ( 0 <= r && r <= 2 && 0 <= c && c <= 2 )
            return true;
        else
            return false;
    }

    public int numTurns()
    {
        return this.turns++;
    }

    public char playerAt( int r, int c )
    {
        if ( isValid(r,c) )
            return board[r][c];
        else
            return '@';
    }

    public void displayBoard()
    {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }
    public void playMove( char p, int r, int c )
        {this.board[r][c] = p;
        //this.numTurns();
    }

}