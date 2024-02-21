
package ru.kerporation.dataanalyzermicroservice.service;

import ru.kerporation.dataanalyzermicroservice.data.Data;

public interface KafkaDataService {
    void handle(final Data data);
}