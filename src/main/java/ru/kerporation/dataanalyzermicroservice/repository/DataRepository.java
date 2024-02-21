package ru.kerporation.dataanalyzermicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kerporation.dataanalyzermicroservice.data.Data;

public interface DataRepository extends JpaRepository<Data, Long> {
}