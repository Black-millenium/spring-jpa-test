package me.desu.springjpatest.entity;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Collection;

@Data
@Entity
@Table(name = "table_parent_one_to_many", schema = "public", catalog = "postgres")
public class TableParentOneToManyEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "text_data", nullable = true, length = -1)
    private String textData;

    @OneToMany(mappedBy = "tableParentOneToManyByParentId", fetch = FetchType.EAGER)
    private Collection<TableChildManyToOneEntity> tableChildManyToOnesById;
}
