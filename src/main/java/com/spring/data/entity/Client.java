package com.spring.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Map;

@Data
@Entity
@Builder
@Table(name = "client")
@NoArgsConstructor
@AllArgsConstructor
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    /**
     * 一个客户有多个地址
     */
    @ElementCollection
    @MapKeyColumn(name = "addr_key")
    @CollectionTable(name = "client_address")
    @AttributeOverrides({
            @AttributeOverride(name = "value.detailedAddress", column = @Column(name = "addr_detailed")),
            @AttributeOverride(name = "value.zipCode", column = @Column(name = "addr_zip"))
    })

    private Map<String, Address> addresses;

}
