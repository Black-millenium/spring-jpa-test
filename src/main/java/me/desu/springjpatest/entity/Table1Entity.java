package me.desu.springjpatest.entity;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.Table;
import java.util.Map;

@Data
@Entity
@Table(name = "table1")
public class Table1Entity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "data", nullable = true, length = -1)
    private String data;

    @ElementCollection
    @CollectionTable(name = "table1_to_table2", joinColumns = @JoinColumn(name = "fk_table1"))
    @MapKeyJoinColumn(name = "fk_table2")
    @Column(name = "additional_data")
    private Map<Table2Entity, String> table2EntityStringMap;
}
