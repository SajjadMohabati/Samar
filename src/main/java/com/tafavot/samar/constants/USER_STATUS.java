package com.tafavot.samar.constants;

import com.tafavot.samar.core.IConstants;

public enum USER_STATUS implements IConstants<USER_STATUS> {
    ACTIVE(10),
    INACTIVE(20),
    SUSPENDED(30)
    ;

    public final int VALUE;
    USER_STATUS(int value) {
        VALUE = value;
    }

    @Override
    public int getValue() {
        return VALUE;
    }

    public static USER_STATUS getEnum(int value){
        for(USER_STATUS e : USER_STATUS.values()){
            if(e.VALUE == value){
                return e;
            }
        }
        return null;
    }
}
