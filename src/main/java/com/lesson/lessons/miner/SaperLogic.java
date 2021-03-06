package com.lesson.lessons.miner;

public interface SaperLogic {
    void loadBoard(Cell[][] cells);

    boolean shouldBang(int x, int y);

    boolean finish();

    void suggest(int x, int y, boolean bomb);
}
