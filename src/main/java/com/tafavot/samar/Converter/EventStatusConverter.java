package com.tafavot.samar.Converter;

import com.tafavot.samar.constants.EVENT_STATUS;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class EventStatusConverter implements AttributeConverter<EVENT_STATUS, Integer> {

    @Override
    public Integer convertToDatabaseColumn(EVENT_STATUS status) {
        if (status == null) {
            return null;
        }
        return status.getValue();
    }

    @Override
    public EVENT_STATUS convertToEntityAttribute(Integer dbData) {
        if (dbData == null) {
            return null;
        }
        return EVENT_STATUS.getEnum(dbData);
    }
}
