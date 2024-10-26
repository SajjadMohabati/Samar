package com.tafavot.samar.constants;

import com.tafavot.samar.core.IConstants;

public enum EVENT_STATUS implements IConstants<EVENT_STATUS> {
    DRAFT(10),
    PUBLISH(20),
    REGISTER(30),
    ENDED(40),
    CANCELLED(50);

    public final int VALUE;
    EVENT_STATUS(int value){
        this.VALUE = value;
    }

    @Override
    public int getValue() {
        return VALUE;
    }

    public static EVENT_STATUS getEnum(int value){
        for(EVENT_STATUS e : EVENT_STATUS.values()){
            if(e.VALUE == value){
                return e;
            }
        }
        return null;
    }
}
