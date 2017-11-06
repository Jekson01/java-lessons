package com.lesson.lessons.miner;

public interface Board {
    void drawBoard(Cell[][] cells);

    void drawCell(int x, int y);

    void drawBang();

    void drawCongratulate();
}
