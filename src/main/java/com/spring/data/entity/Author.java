package com.spring.data.entity;

import com.spring.data.enu.Sex;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Builder
@Table(name = "author")
@NoArgsConstructor
@AllArgsConstructor
public class Author implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String authorName;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "detailedAddress",column = @Column(name = "addr_detailed")),
            @AttributeOverride(name = "zipCode",column = @Column(name = "addr_zip"))
    })
    private Address address;
}
