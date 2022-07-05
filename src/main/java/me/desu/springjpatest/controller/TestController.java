package me.desu.springjpatest.controller;

import lombok.AllArgsConstructor;
import me.desu.springjpatest.dto.TableParentOneToManyDTO;
import me.desu.springjpatest.mapper.TableParentOneToManyMapper;
import me.desu.springjpatest.repository.TableParentOneToManyRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController("/api")
public class TestController {

    private final TableParentOneToManyRepository repository;
    private final TableParentOneToManyMapper mapper;

    @GetMapping("/list-parent")
    List<TableParentOneToManyDTO> getParentWithChild() {
        return mapper.toDto(repository.findAll());
    }
}
