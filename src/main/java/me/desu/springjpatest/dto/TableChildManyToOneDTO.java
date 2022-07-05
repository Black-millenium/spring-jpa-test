package me.desu.springjpatest.dto;

import lombok.Data;

@Data
public class TableChildManyToOneDTO {
    private Long id;
    private Long parentId;
    private String additionalData;
}
