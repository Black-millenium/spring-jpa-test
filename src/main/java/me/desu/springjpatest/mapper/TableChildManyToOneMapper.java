package me.desu.springjpatest.mapper;

import me.desu.springjpatest.dto.TableChildManyToOneDTO;
import me.desu.springjpatest.entity.TableChildManyToOneEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TableChildManyToOneMapper {

    @Mapping(target = "parentId", source = "tableParentOneToManyByParentId.id")
    TableChildManyToOneDTO toDto(TableChildManyToOneEntity source);

    List<TableChildManyToOneDTO> toDto(List<TableChildManyToOneEntity> sourceList);
}
