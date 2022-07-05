package me.desu.springjpatest.repository;

import me.desu.springjpatest.entity.TableParentOneToManyEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TableParentOneToManyRepository extends JpaRepository<TableParentOneToManyEntity, Long> {

    @EntityGraph(attributePaths = {"tableChildManyToOnesById"})
    @Override
    List<TableParentOneToManyEntity> findAll();
}
