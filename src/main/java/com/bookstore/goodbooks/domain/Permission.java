package com.bookstore.goodbooks.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Permission")
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int permission_id;
    @Column(name = "permission_role_id")
    private int permission_role_id;
    @Column(name = "permission_title")
    private String permission_title;
    @Column(name = "permission_module")
    private String permission_module;
    @Column(name = "permission_description")
    private String permission_description;

}
