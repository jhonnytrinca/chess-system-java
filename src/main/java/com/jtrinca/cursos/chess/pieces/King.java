package com.jtrinca.cursos.chess.pieces;

import com.jtrinca.cursos.boardgame.Board;
import com.jtrinca.cursos.chess.ChessPiece;
import com.jtrinca.cursos.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
