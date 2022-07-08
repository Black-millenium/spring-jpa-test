package me.desu.springjpatest.mapper;

import me.desu.springjpatest.dto.Table1DTO;
import me.desu.springjpatest.dto.Table2DTO;
import me.desu.springjpatest.entity.Table1Entity;
import me.desu.springjpatest.entity.Table2Entity;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface Table1Mapper {

    List<Table1DTO> toDto(List<Table1Entity> sourceList);

    Table1DTO toDto(Table1Entity source);

    Table2DTO toDto(Table2Entity source);

    default List<Table1DTO.Table2DTOString> map(Map<Table2Entity, String> sourceMap) {
        return sourceMap.entrySet()
                .stream()
                .map(entry -> new Table1DTO.Table2DTOString(toDto(entry.getKey()), entry.getValue()))
                .collect(Collectors.toList());
    }
}
