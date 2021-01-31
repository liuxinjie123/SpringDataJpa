package com.spring.data.entity.addr;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Builder
@Table(name = "province")
@NoArgsConstructor
@AllArgsConstructor
public class Province implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String name;

    /**
     * 一对多
     */
    @ElementCollection
    @CollectionTable(name = "city", joinColumns = {@JoinColumn(name = "province_id", referencedColumnName = "id")})
    List<City> cityList;
}
