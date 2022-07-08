package me.desu.springjpatest.repository;

import me.desu.springjpatest.entity.Table1Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Table1Repository extends JpaRepository<Table1Entity, Integer> {
}
