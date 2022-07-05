package me.desu.springjpatest.dto;

import lombok.Data;

import java.util.Collection;

@Data
public class TableParentOneToManyDTO {
    private Long id;
    private String textData;
    private Collection<TableChildManyToOneDTO> tableChildManyToOnesById;
}
