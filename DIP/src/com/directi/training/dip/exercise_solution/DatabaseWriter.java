package com.directi.training.dip.exercise_solution;
public class DatabaseWriter implements WriterInterface{
    @Override
    public void write(String input)
    {
        MyDatabase database = new MyDatabase();
        database.write(input);
    }
}