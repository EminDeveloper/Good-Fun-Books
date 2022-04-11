package com.bookstore.goodbooks.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int role_id;
    @Column(name = "role_title")
    private String role_title;
    @Column(name = "role_description")
    private String role_description;
}
