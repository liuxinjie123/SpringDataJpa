package com.spring.data.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.IdClass;

@Data
@Entity
@IdClass(value = UnionKey.class)
public class IdClassDemo {
}
