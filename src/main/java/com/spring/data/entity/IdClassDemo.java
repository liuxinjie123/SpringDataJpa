package com.spring.data.entity;

import com.spring.data.dto.UnionKey;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Data
@Table(name = "id_class_demo")
@Entity
@IdClass(value = UnionKey.class)
public class IdClassDemo {
    @Id
    private String idOne;

    @Id
    private String idTwo;

    private String context;

}
