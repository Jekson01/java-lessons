package com.lesson.lessons.miner;

import com.lesson.lessons.miner.console.ConsoleBoard;
import com.lesson.lessons.miner.console.ConsoleCell;
import com.lesson.lessons.miner.logics.Easy;
import org.junit.Test;

import static org.junit.Assert.*;

public class BaseActionTest {
    final BaseAction action = new BaseAction(new Easy(), new ConsoleBoard(),
            new GeneratorBoard() {
                public Cell[][] generate() {
                    return new Cell[][]{
                            {new ConsoleCell(true), new ConsoleCell(false)},
                            {new ConsoleCell(true), new ConsoleCell(false)}
                    };
                }
            });

    @Test
    public void succesGame(){
        action.initGame();
        action.select(0, 0, true);
        action.select(1, 0, true);
        action.select(0, 1, false);
        action.select(1, 1, false);
    }

    @Test
    public void failureGame(){
        action.initGame();
        action.select(0, 0, true);
        action.select(1, 0, false);
    }

}