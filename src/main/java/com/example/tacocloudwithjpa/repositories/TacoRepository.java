package com.example.tacocloudwithjpa.repositories;

import com.example.tacocloudwithjpa.data.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}