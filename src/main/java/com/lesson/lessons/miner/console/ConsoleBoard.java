package com.lesson.lessons.miner.console;

import com.lesson.lessons.miner.Board;
import com.lesson.lessons.miner.Cell;

public class ConsoleBoard implements Board {
    private Cell[][] cells;

    public void drawBoard(Cell[][] cells) {
        this.cells = cells;
        this.redraw(false);
    }

    public void drawCell(int x, int y) {
        System.out.println("***** SELECT *****");
        this.redraw(false);
    }

    public void drawBang() {
        System.out.println("***** BANG *****");
        this.redraw(true);
    }

    public void drawCongratulate() {
        System.out.println("*** Congratulate ***");
    }

    private void redraw(boolean real){
        for (Cell[] row : cells){
            for(Cell cell : row){
                cell.draw(System.out, real);
            }
            System.out.println();
        }
        System.out.println();
    }
}
