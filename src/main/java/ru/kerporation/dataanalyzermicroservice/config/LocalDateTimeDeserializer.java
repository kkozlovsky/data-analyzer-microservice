package ru.kerporation.dataanalyzermicroservice.config;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;
import java.time.LocalDateTime;

@Component
public class LocalDateTimeDeserializer
        implements JsonDeserializer<LocalDateTime> {

    @Override
    public LocalDateTime deserialize(final JsonElement json,
                                     final Type typeOfT,
                                     final JsonDeserializationContext context) {
        final JsonArray jsonArray = json.getAsJsonArray();
        final int year = jsonArray.get(0).getAsInt();
        final int month = jsonArray.get(1).getAsInt();
        final int day = jsonArray.get(2).getAsInt();
        final int hour = jsonArray.get(3).getAsInt();
        final int minute = jsonArray.get(4).getAsInt();
        final int second = jsonArray.get(5).getAsInt();
        return LocalDateTime.of(year, month, day, hour, minute, second);
    }

}