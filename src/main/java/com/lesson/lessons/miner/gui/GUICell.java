package com.lesson.lessons.miner.gui;

import com.lesson.lessons.miner.Cell;

import java.awt.*;

public class GUICell implements Cell<Graphics> {
    public boolean isBomb() {
        return false;
    }

    public boolean isSuggestBomb() {
        return false;
    }

    public boolean isSuggestEmpty() {
        return false;
    }

    public void suggectEmpty() {

    }

    public void suggectBomb() {

    }

    public void draw(Graphics paint, boolean real) {

    }
}
