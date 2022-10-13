package com.directi.training.ocp.exercise_solution;

public class ResourceAllocator
{
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(Resource _resource)
    {
        int resourceId;

        resourceId = _resource.findFreeResourceSlot();
        _resoruce.markResourcelotBusy(resourceId);
        return resourceId;
    }

    public void free(int resourceId)
    {
        markResourceSlotFree(resourceId);
       
    }
}
