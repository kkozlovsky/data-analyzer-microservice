package ru.kerporation.dataanalyzermicroservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.kerporation.dataanalyzermicroservice.data.Data;
import ru.kerporation.dataanalyzermicroservice.repository.DataRepository;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaDataServiceImpl implements KafkaDataService {

    private final DataRepository dataRepository;

    @Override
    public void handle(final Data data) {
        log.info("Data object {} was saved", data);
        dataRepository.save(data);
    }

}