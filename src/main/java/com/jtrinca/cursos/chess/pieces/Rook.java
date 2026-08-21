package com.jtrinca.cursos.chess.pieces;

import com.jtrinca.cursos.boardgame.Board;
import com.jtrinca.cursos.chess.ChessPiece;
import com.jtrinca.cursos.chess.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
