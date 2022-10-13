package com.directi.training.ocp.exercise_solution;

public abstract class Resource
{
    protected int _id;

    public abstract void markResourceSlotFree(int resourceId)
    {
    }

    public abstract void markResourceSlotBusy(int resourceId)
    {
    }

    public abstract int findFreeResourceSlot()
    {
        return 0;
    }

    public int getResourceId(){
        return _id;
    }

}
