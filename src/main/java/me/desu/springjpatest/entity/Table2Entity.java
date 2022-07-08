package me.desu.springjpatest.entity;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.Table;

@NamedEntityGraph(
        name = "Table2Entity.loadAll",
        attributeNodes = {
                @NamedAttributeNode("id"),
                @NamedAttributeNode("data")
        }
)
@Data
@Entity
@Table(name = "table2")
public class Table2Entity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "data", nullable = true, length = -1)
    private String data;
}
