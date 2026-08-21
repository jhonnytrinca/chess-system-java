package com.jtrinca.cursos;

import com.jtrinca.cursos.chess.ChassMatch;
import com.jtrinca.cursos.chess.ChessException;
import com.jtrinca.cursos.chess.ChessPiece;
import com.jtrinca.cursos.chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ChassMatch chassMatch = new ChassMatch();
        Scanner sc = new Scanner(System.in);

        while(true) {
            try {
                UI.clearScreen();
                UI.printBoard(chassMatch.getPieces());
                System.out.println();
                System.out.println("Source: ");
                ChessPosition source = UI.readChessPosition(sc);

                System.out.println();
                System.out.println("Target: ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chassMatch.performChessMove(source, target);
            } catch (ChessException | InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }
}
