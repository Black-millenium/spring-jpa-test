package me.desu.springjpatest.repository;

import me.desu.springjpatest.entity.Table1Entity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Table1Repository extends JpaRepository<Table1Entity, Integer> {

    @EntityGraph(value = "Table1Entity.loadAll")
    @Override
    List<Table1Entity> findAll();
}
