package com.lesson.lessons;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void add() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(1,2);
        Assert.assertEquals(3, calculator.getResult());
    }

}