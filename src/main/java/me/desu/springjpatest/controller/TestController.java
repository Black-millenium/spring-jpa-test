package me.desu.springjpatest.controller;

import lombok.AllArgsConstructor;
import me.desu.springjpatest.dto.Table1DTO;
import me.desu.springjpatest.dto.TableParentOneToManyDTO;
import me.desu.springjpatest.mapper.Table1Mapper;
import me.desu.springjpatest.mapper.TableParentOneToManyMapper;
import me.desu.springjpatest.repository.Table1Repository;
import me.desu.springjpatest.repository.TableParentOneToManyRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController("/api")
public class TestController {

    private final TableParentOneToManyRepository tableParentOneToManyRepository;
    private final TableParentOneToManyMapper tableParentOneToManyMapper;

    private final Table1Repository table1Repository;
    private final Table1Mapper table1Mapper;

    @GetMapping("/list-parent")
    List<TableParentOneToManyDTO> getParentWithChild() {
        return tableParentOneToManyMapper.toDto(tableParentOneToManyRepository.findAll());
    }

    @GetMapping("/list-map")
    List<Table1DTO> getMapMapped() {
        return table1Mapper.toDto(table1Repository.findAll());
    }
}
