package com.directi.training.lsp.exercise_solution;

public class ElectronicDuck implements DuckInterface
{
    private boolean _on = false;

    @Override
    public void quack() throws DuckInterfaceException
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new DuckInterfaceException("Can't quack when off");
        }
    }

    @Override
    public void swim() throws DuckInterfaceException
    {
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            throw new DuckInterfaceException("Can't swim when off");
        }
    }

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }
}
