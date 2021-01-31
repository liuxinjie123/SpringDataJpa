package com.spring.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@Entity
@Builder
@Table(name = "client")
@NoArgsConstructor
@AllArgsConstructor
public class NewClient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String name;

    /**
     * 一个客户有多个地址
     */
    @ElementCollection
    @CollectionTable(name = "client_address", joinColumns = {@JoinColumn(name = "client_id", referencedColumnName = "id")})
    private List<Address> addressList;

}
