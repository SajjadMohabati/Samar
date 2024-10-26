package com.tafavot.samar.Converter;

import com.tafavot.samar.constants.EVENT_STATUS;
import com.tafavot.samar.constants.USER_STATUS;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class UserStatusConverter implements AttributeConverter<USER_STATUS, Integer> {
    @Override
    public Integer convertToDatabaseColumn(USER_STATUS attribute) {
        if(attribute == null){
            return null;
        }
        return attribute.getValue();
    }

    @Override
    public USER_STATUS convertToEntityAttribute(Integer dbData) {
        if(dbData == null){
            return null;
        }
        return USER_STATUS.getEnum(dbData);
    }
}
