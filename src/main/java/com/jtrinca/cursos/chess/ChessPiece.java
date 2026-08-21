package com.jtrinca.cursos.chess;

import com.jtrinca.cursos.boardgame.Board;
import com.jtrinca.cursos.boardgame.Piece;

public abstract class ChessPiece extends Piece {

    private final Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
