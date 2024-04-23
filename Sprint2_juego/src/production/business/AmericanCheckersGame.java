package production.business;

public class AmericanCheckersGame {
    private static final int TOTALROWS = 8;
    private static final int TOTALCOLUMNS = 8;

    private CheckersPiece[][] grid;
    private String turn;

    public enum GameState {
        PLAYING, DRAW, RED_WON, BLACK_WON
    }

    private GameState currentGameState;

    public AmericanCheckersGame() {
        grid = new CheckersPiece[TOTALROWS][TOTALCOLUMNS];
        initGame();
    }

    private void initGame() {
        for (int row = 0; row < TOTALROWS; ++row) {
            for (int col = 0; col < TOTALCOLUMNS; ++col) {

                if((row+col)%2==1 && row<3) {
                    grid[row][col] = new CheckersPiece("RED");
                }
                if((row+col)%2==1 && row>4) {
                    grid[row][col] = new CheckersPiece("BLACK");
                }
            }
        }
        currentGameState = GameState.PLAYING;
        turn = "BLACK";
    }

    public void resetGame() {
        initGame();
    }

    public int getTotalRows() {
        return TOTALROWS;
    }

    public int getTotalColumns() {
        return TOTALCOLUMNS;
    }

    public CheckersPiece getCheckersPiece(int row, int column) {
        if (row >= 0 && row < TOTALROWS && column >= 0 && column < TOTALCOLUMNS) {
            return grid[row][column];
        } else {
            return null;
        }
    }

    public String getTurn() {
        return turn;
    }

    public GameState getGameState() {
        return currentGameState;
    }

}
