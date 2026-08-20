package com.jtrinca.cursos;

import com.jtrinca.cursos.chess.ChassMatch;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ChassMatch chassMatch = new ChassMatch();
        UI.printBoard(chassMatch.getPieces());
    }
}
