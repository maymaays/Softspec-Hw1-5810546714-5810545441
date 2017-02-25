package tic_tac_toe;

/**
 * Represents the player of TicTacToe's game
 * 
 * @author Methawee Apinainarong 5810546714, Palita Samrongpol 5810545441**
 */

public class Player {

	private static char currentPlayer;
	private static Board board = new Board();
	private static Player player = new Player();

	/** Constructs the first player of game with 'X' symbol **/

	public Player() {
		currentPlayer = 'X';
	}

	/**
	 * Gets the current player of a game return a symbol ('X' or 'O')
	 **/

	public static char getCurrentPlayer() {
		return currentPlayer;
	}

	/**
	 * Sets the current player of a game
	 **/

	public static void setCurrentPlayer(char currentPlayer) {
		Player.currentPlayer = currentPlayer;
	}

	/** Changes a symbol when the player is changed. **/

	public static void changePlayer() {
		if (currentPlayer == 'X') {
			currentPlayer = 'O';
		} else {
			currentPlayer = 'X';
		}
	}

	/**
	 * Marks the current position with symbol.
	 * 
	 * @param row
	 *            the row of current position
	 * @param col
	 *            the colums of current position
	 * @return the current position's status
	 **/
	public static boolean currentMark(int row, int col) {
		if ((row >= 0) && (row < 9)) {
			if ((col >= 0) && (col < 9)) {
				if (board.getBoard()[row][col] == '-') {
					board.getBoard()[row][col] = player.getCurrentPlayer();
					return true;
				}
			}
		}
		return false;
	}
}