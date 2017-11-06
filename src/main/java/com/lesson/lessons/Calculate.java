package com.lesson.lessons;

import com.lesson.lessons.Calculator;
import com.lesson.lessons.UserException;

public class Calculate{
    public static void main(String[] arg){

        Calculator calc = new Calculator();
        System.out.println("Calculate");
        calc.add(1,2,3);
        calc.add(1);
        calc.add(1);
        System.out.println(calc.getResult());
        try {
            calc.div(2);
        } catch (UserException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(calc.getResult());
    }
}