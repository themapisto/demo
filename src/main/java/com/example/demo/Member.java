package com.example.demo;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name="MEMBER")
@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name= "ID" )
    private Long id;

    @Column(name = "NAME")
    private String username;


    @Column(length = 200,nullable = false)
    private Long meberDesc;

    private Integer age;

}