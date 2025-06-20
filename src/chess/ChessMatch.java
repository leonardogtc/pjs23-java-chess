package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] pieces = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				pieces[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return pieces;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		// Initial setup of the chess pieces on the board
		placeNewPiece('a', 1, new Rook(board, Color.WHITE));
		
		// White King
		placeNewPiece('e', 8, new King(board, Color.WHITE));
		
		// Black King
		placeNewPiece('e', 1, new King(board, Color.BLACK));
//		board.placePiece(new King(board, Color.WHITE), new Position(0, 4));
//		board.placePiece(new King(board, Color.BLACK), new Position(7, 4));
//		// Add other pieces as needed
//		board.placePiece(new Rook(board, Color.WHITE), new Position(0, 0));
//		board.placePiece(new Rook(board, Color.BLACK), new Position(7, 0));
		
		
	}
}
