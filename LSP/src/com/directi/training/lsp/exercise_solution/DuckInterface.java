package com.directi.training.lsp.exercise_solution;

public interface DuckInterface {
    public void quack() throws DuckInterfaceException;

    public void swim() throws DuckInterfaceException;

    class DuckInterfaceException extends Exception{
        public DuckInterfaceException(String message){
            super(message);
        }
    }
}