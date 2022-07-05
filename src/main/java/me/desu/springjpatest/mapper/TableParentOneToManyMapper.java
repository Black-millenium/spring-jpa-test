package me.desu.springjpatest.mapper;

import me.desu.springjpatest.dto.TableParentOneToManyDTO;
import me.desu.springjpatest.entity.TableParentOneToManyEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {TableChildManyToOneMapper.class})
public interface TableParentOneToManyMapper {

    TableParentOneToManyDTO toDto(TableParentOneToManyEntity source);

    List<TableParentOneToManyDTO> toDto(List<TableParentOneToManyEntity> sourceList);
}
