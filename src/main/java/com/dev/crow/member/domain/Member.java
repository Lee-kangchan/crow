package com.dev.crow.member.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author :      lee_kangchan
 * @FileName :    Member
 * @Date :        2022/10/12
 * @Discription : 멤버 정보
 */

@Entity
@Getter
@NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "seq")
    private Long seq;

    private String email;
    private String password;
    private String name;

}
