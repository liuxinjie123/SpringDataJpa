package com.spring.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Builder
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Address implements Serializable {
    private String province;

    private String city;

    private String country;

    /**
     * 可嵌入对象中的字段也可以使用@Column进行修饰
     */
    @Column(nullable = false, name = "addr_detailed")
    private String addressDetail;

    @Column(name = "zip_code")
    private String zipCode;
}
