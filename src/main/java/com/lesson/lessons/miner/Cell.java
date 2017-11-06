package com.lesson.lessons.miner;

public interface Cell<T> {
    boolean isBomb();

    boolean isSuggestBomb();

    boolean isSuggestEmpty();

    void suggectEmpty();

    void suggectBomb();

    void draw(T paint, boolean real);
}
