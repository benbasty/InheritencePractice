package com.projects;

public class LeopardSeal implements HasTail, HasWhiskers {
    @Override
    public int getTailLength() {
        return 0;
    }

    @Override
    public int getNumberOfWhiskers() {
        return 0;
    }
    // DOES NOT COMPILE
}
