package com.sofka.domain;

import lombok.Data;
import lombok.Generated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Data
@Entity
public class agenda implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id")
    private Long id;

    @Column(name = "contact_name")
    private String name;

    @Column(name = "contact_number")
    private String number;

    @Column(name = "contact_email")
    private String email;

    @Column(name = "contact_born")
    private String born;
 }
