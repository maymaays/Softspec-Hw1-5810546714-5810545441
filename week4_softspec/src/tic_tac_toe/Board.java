package tic_tac_toe;

/**
 * Represents the board of TicTacToe's game
 * 
 * @author Methawee Apinainarong 5810546714, Palita Samrongpol 5810545441
 **/
public class Board {

	private static char[][] board;

	/**
	 * Constructs a board with 9 X 9
	 **/

	public Board() {
		board = new char[9][9];
	}

	/**
	 * Gets the board of this game
	 * 
	 * @return a board
	 **/

	public static char[][] getBoard() {
		return board;
	}

	/** Sets the board of this game **/

	public static void setBoard(char[][] board) {
		Board.board = board;
	}

	/** Generates a new board for players **/
	public static void initialBoard() {
		System.out.println("Welcome to TicTacToe ♡");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				board[i][j] = '-';
			}
		}
	}

	/** Checks the status of board, a board is full or not **/

	public boolean isFull() {
		boolean full = true;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == '-') {
					full = false;
				}
			}
		}
		return full;
	}

	/** Prints the board of current game **/

	public String toString() {
		String temp = "";
		for (int i = 0; i < 10; i++) {
			temp += String.format("%d   ", i);
		}
		temp += "\n";
		for (int i = 0; i < 9; i++) {
			temp += String.format("%d | ", i + 1);
			for (int j = 0; j < 9; j++) {
				temp += String.format("%c | ", board[i][j]);
			}
			temp += "\n";
		}
		return temp;
	}
}
