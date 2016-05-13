package appiah;
/* 
 * TicTacToe
 * This program plays a game of tic tac toe with two users
 * Kevin Appiah
 * May 13, 2016
 */
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		
		// Array
		char [][] board = { {' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
		
		// Variables
		int rows;				
		int column;				
		boolean win = false;

		while (win == false){

			//X's Turn

			System.out.println("Player 1, please enter row, and then a column");
			rows = scan.nextInt();

			column = scan.nextInt();

			board[rows -1][column - 1] = 'X';
			
			//Display Board
			System.out.println(board[0][0]+ "   " + board[0][1] + "   " + board[0][2]);
			System.out.println(board[1][0]+ "   " + board[1][1] + "   " + board[1][2]);
			System.out.println(board[2][0]+ "   " + board[2][1] + "   " + board[2][2]);



			if(board[0][0] == board[0][1] && board[0][0] == board[0][2] && board[0][0] != ' '){

				System.out.println(board[0][0] + " wins!"); 
				win = true;
			}
			else if (board[1][0] == board[1][1] && board[1][0] == board[1][2] && board[1][0] != ' '){

				System.out.println(board[1][0] + " wins!"); 
				win = true;
			}
			else if (board[2][0] == board[2][1] && board[2][0] == board[2][2] && board[2][0] != ' '){

				System.out.println(board[2][0] + " wins!"); 
				win = true;

			}
			else if (board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[0][0] != ' '){

				System.out.println(board[0][0] + " wins!"); 
				win = true;

			}
			else if (board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[0][1] != ' '){

				System.out.println(board[0][1] + " wins!"); 
				win = true;

			}
			else if (board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[0][0] != ' '){

				System.out.println(board[0][0] + " wins!"); 
				win = true;

			}
			else if (board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[0][1] != ' '){

				System.out.println(board[0][1] + " wins!"); 
				win = true;

			}
			else if (board[0][2] == board[1][2] && board[0][2] == board[1][2] && board[0][2] != ' '){

				System.out.println(board[0][2] + " wins!"); 
				win = true;

			}
			else if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != ' '){

				System.out.println(board[0][0] + " wins!"); 
				win = true;

			}
			else if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != ' '){

				System.out.println(board[0][2] + " wins!"); 
				win = true;

			}

			//O's Turn			
			System.out.println("Player 2, please enter row, and then a column");
			rows = scan.nextInt();			
			column = scan.nextInt();

			board[rows -1][column - 1] = 'O';
			
			//Display board

			System.out.println(board[0][0]+ "   " + board[0][1] + "   " + board[0][2]);
			System.out.println(board[1][0]+ "   " + board[1][1] + "   " + board[1][2]);
			System.out.println(board[2][0]+ "   " + board[2][1] + "   " + board[2][2]);


			if(board[0][0] == board[0][1] && board[0][0] == board[0][2] && board[0][0] != ' '){

				System.out.println(board[0][0] + " wins!"); 
				win = true;
			}
			else if (board[1][0] == board[1][1] && board[1][0] == board[1][2] && board[1][0] != ' '){

				System.out.println(board[1][0] + " wins!"); 
				win = true;
			}
			else if (board[2][0] == board[2][1] && board[2][0] == board[2][2] && board[2][0] != ' '){

				System.out.println(board[2][0] + " wins!"); 
				win = true;

			}
			else if (board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[0][0] != ' '){

				System.out.println(board[0][0] + " wins!"); 
				win = true;

			}
			else if (board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[0][1] != ' '){

				System.out.println(board[0][1] + " wins!"); 
				win = true;

			}
			else if (board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[0][0] != ' '){

				System.out.println(board[0][0] + " wins!"); 
				win = true;

			}
			else if (board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[0][1] != ' '){

				System.out.println(board[0][1] + " wins!"); 
				win = true;

			}
			else if (board[0][2] == board[1][2] && board[0][2] == board[1][2] && board[0][2] != ' '){

				System.out.println(board[0][2] + " wins!"); 
				win = true;

			}
			else if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != ' '){

				System.out.println(board[0][0] + " wins!"); 
				win = true;

			}
			else if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != ' '){

				System.out.println(board[0][2] + " wins!"); 
				win = true;

			}




















		}
	}



}
