package tic_tac_toe;

import java.util.Scanner;

/**
 * Represents all output of TicTacToe's game.
 * 
 * @param args
 * @author Methawee Apinainarong 5810546714, Palita Samrongpol 5810545441
 **/

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Board board = new Board();
		TicTacToe game = new TicTacToe();
		Player player = new Player();
		int row = 0, col = 0;
		board.initialBoard();
		System.out.println(board.toString());

		while (!board.isFull()) {
			TicTacToe.printTurn();
			System.out.print("Please select row: ");
			row = scan.nextInt();
			System.out.print("Please select col: ");
			col = scan.nextInt();
			if ((row > 9 && col > 9) || (row > 9 && col <= 9) || (row <= 9 && col > 9)) {
				System.out.println("value ERROR! Playing a New Game, PLEASE ♡");
				break;
			}
			while (Board.getBoard()[row - 1][col - 1] != '-') {
				System.out.println("\n\nYou can't place on that cell.");
				TicTacToe.printTurn();
				System.out.print("Please select row: ");
				row = scan.nextInt();
				System.out.print("Please select col: ");
				col = scan.nextInt();
				if ((row > 9 && col > 9) || (row > 9 && col <= 9) || (row <= 9 && col > 9)) {
					System.out.println("value ERROR! Playing a New Game, PLEASE ♡");
					break;
				}
			}
			if ((row > 9 && col > 9) || (row > 9 && col <= 9) || (row <= 9 && col > 9)) {
				break;
			}
			player.currentMark(row - 1, col - 1);
			System.out.println();
			System.out.printf("You placed %s on (%d, %d)\n", player.getCurrentPlayer(), row, col);
			System.out.print(board.toString());
			if (game.isWin()) {
				if (player.getCurrentPlayer() == 'X') {
					System.out.println("\nPlayer'1 win.");
				} else {
					System.out.println("\nPlayer'2 win.");
				}
				break;
			}
			player.changePlayer();
		}
		if (board.isFull()) {
			System.out.println("Game draw.");
		}
	}
}
