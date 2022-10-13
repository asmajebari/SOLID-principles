package com.directi.training.lsp.exercise_solution;
import com.directi.training.lsp.exercise.DuckInterface.DuckInterfaceException;
public class Pool
{
    public void run()
    {
        Duck donaldDuck = new Duck();
        Duck electricDuck = new ElectronicDuck();
        electricDuck.turnOff();
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(DuckInterface... ducks)
    {
        for (DuckInterface duck : ducks) {
            try{
            duck.quack();
            } catch (DuckInterfaceException e) {
				System.out.println(e.getMessage());
			}
        }
    }

    private void swim(DuckInterface... ducks)
    {
        for (DuckInterface duck : ducks) {
            try{
            duck.swim();
            } catch (DuckInterfaceException e) {
				System.out.println(e.getMessage());
			}
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
