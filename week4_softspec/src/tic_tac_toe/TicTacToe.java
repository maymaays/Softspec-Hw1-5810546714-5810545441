package tic_tac_toe;

/**
 * Respresent a description of TicTacToe's game.
 * 
 * @author Methawee Apinainarong 5810546714, Palita Samrongpol 5810545441
 */
public class TicTacToe {

	private static Board board;
	private static Player player;

	/**
	 * Constructs an initial game. The game should include board and player.
	 **/

	public TicTacToe() {
		board = new Board();
		player = new Player();
	}

	/**
	 * Checks the winner in the right diagonal (/)
	 * 
	 * @return the status of player in a game
	 **/
	private static boolean isDiagonalRightWin() {
		int i = 0, countRight = 0;
		while (i < 9) {
			if (board.getBoard()[i][i] == Player.getCurrentPlayer()) {
				countRight++;
				if (countRight == 5) {
					return true;
				}
			} else {
				countRight = 0;
			}
			i++;
		}
		return false;
	}

	/**
	 * Checks the winner in the left diagonal (\)
	 * 
	 * @return the status of player in game
	 **/
	private static boolean isDiagonalLeftWin() {
		int i = 8, j = 0, countLeft = 0;

		while (i >= 0) {
			if (board.getBoard()[i][j] == player.getCurrentPlayer()) {
				countLeft++;
				if (countLeft == 5) {
					return true;
				}
			} else {
				countLeft = 0;
			}
			i--;
			j++;
		}
		return false;
	}

	/**
	 * Checks the winner in column (|)
	 * 
	 * @return the status of player in game
	 **/

	private static boolean isColumnsWin() {
		int countCol = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board.getBoard()[j][i] == player.getCurrentPlayer()) {
					countCol++;
					if (countCol == 5) {
						return true;
					}
				}
			}
			countCol = 0;
		}
		return false;
	}

	/**
	 * Checks the winner in rows (-)
	 * 
	 * @return the status of player in game
	 **/
	private static boolean isRowsWin() {
		int countRow = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board.getBoard()[i][j] == player.getCurrentPlayer()) {
					countRow++;
					if (countRow == 5) {
						return true;
					}
				}
			}
			countRow = 0;
		}
		return false;
	}

	/**
	 * Checks if any type of winning occur
	 * 
	 * @return the status of player in game
	 **/
	public static boolean isWin() {
		return (isRowsWin() || isColumnsWin() || isDiagonalRightWin() || isDiagonalLeftWin());
	}

	/**
	 * Prints the current player turn
	 * 
	 **/
	public static void printTurn() {
		if (player.getCurrentPlayer() == 'X') {
			System.out.println("\nPlayer 1's turn.");
		} else {
			System.out.println("\nPlayer 2's turn.");
		}
	}
}
