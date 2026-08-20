package com.jtrinca.cursos.chess;

import com.jtrinca.cursos.boardgame.Board;
import com.jtrinca.cursos.boardgame.Position;
import com.jtrinca.cursos.chess.pieces.King;
import com.jtrinca.cursos.chess.pieces.Rook;

public class ChassMatch {
    private Board board;

    public ChassMatch() {
        board = new Board(8,8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    private void initialSetup() {
        board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
        board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
        board.placePiece(new King(board, Color.BLACK), new Position(7, 4));
    }
}
