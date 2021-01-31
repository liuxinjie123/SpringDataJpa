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
//@Embeddable
//@Table(name = "city")
@NoArgsConstructor
@AllArgsConstructor
public class City implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

//    @Column(name = "province_id")
//    private Long provinceId;

    private String name;

    /**
     * 一对多
     */
    @ElementCollection
    @CollectionTable(name = "area", joinColumns = {@JoinColumn(name = "city_id", referencedColumnName = "id")})
    List<Area> areaList;
}
