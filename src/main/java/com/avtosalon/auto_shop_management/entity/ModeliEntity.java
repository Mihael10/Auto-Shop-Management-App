package com.avtosalon.auto_shop_management.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Data // getter and setter
@AllArgsConstructor // construktor od site variabili
@NoArgsConstructor // prazen
@ToString
@Entity
@Table(name = "modeli")
public class ModeliEntity  {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int modeli_id;

    @Column(name = "modeli_name")
    private String modeli_name;

    @Column(name = "color")
    private String color;

    @Column(name = "price")
    private int price;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonDeserialize
    @JsonBackReference
    @JoinColumn(name = "marki_id")
    private MarkiEntity marki;

}
