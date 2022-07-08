package me.desu.springjpatest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class Table1DTO {
    private Integer id;
    private String data;
    private List<Table2DTOString> table2EntityList;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Table2DTOString {
        private Table2DTO table2DTO;
        private String additionalValue;
    }
}
