package com.lesson.lessons;

public class Calculator {

    private int result;

    public void add(int ... params){
        for (int param : params){
            result += param;
        }
    }

    /**
     * Деление
     * @param args аргументы
     * @throws UserException если нет аргументов - исключение
     */
    public void div(int ... args) throws UserException{
        if (args.length > 0){
            for (int arg : args){
                result /= arg;
            }
        }else{
            throw new UserException("You should enter args");
        }
    }

    public int getResult(){
        return result;
    }

    public void resetResult(){
        result = 0;
    }
}
