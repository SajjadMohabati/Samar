package com.example.samar.Converter;

import com.example.samar.Entity.Events;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.springframework.stereotype.Component;

@Converter(autoApply = true)
public class StatusEventConverter implements AttributeConverter<Events.Status, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Events.Status status) {
        if (status == null) {
            return null;
        }
        switch (status) {
            case DRAFT:
                return 10;
            case PUBLISH:
                return 20;
            case REGISTER:
                return 30;
            case ENDED:
                return 40;
            case CANCELLED:
                return 50;
            default:
                throw new IllegalArgumentException("Unknown status: " + status);
        }
    }

    @Override
    public Events.Status convertToEntityAttribute(Integer dbData) {
        if (dbData == null) {
            return null;
        }
        switch (dbData) {
            case 10:
                return Events.Status.DRAFT;
            case 20:
                return Events.Status.PUBLISH;
            case 30:
                return Events.Status.REGISTER;
            case 40:
                return Events.Status.ENDED;
            case 50:
                return Events.Status.CANCELLED;
            default:
                throw new IllegalArgumentException("Unknown database value: " + dbData);
        }
    }
}
