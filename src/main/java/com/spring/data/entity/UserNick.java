package com.spring.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Builder
@Table(name = "user_nick")
@NoArgsConstructor
@AllArgsConstructor
public class UserNick implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "u_id")
    private Long uId;

    @Column(name = "nick_name")
    private String nickName;

}
