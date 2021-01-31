package com.spring.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@Builder
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;

    /**
     *  ElementCollection 映射基本类型和可嵌入类型集合，可以使用; CollectionTable 指定额外产生表的名称，外键名称等。
     */
    @ElementCollection
    @CollectionTable(name = "user_nick", joinColumns = {@JoinColumn(name = "u_id", referencedColumnName = "id")})
    @Column(name = "nick_name")
    private Set<String> nickName;

}
