package com.avtosalon.auto_shop_management.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;


@Data // getter and setter
@AllArgsConstructor // construktor od site variabili
@NoArgsConstructor // prazen
@ToString
@Entity
@Table(name = "marki")
public class MarkiEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int marki_id;

    @Column(name = "marki_name")
    private String marki_name;

    @Column(name = "country")
    private String country;

    @Column(name = "eu")
    private boolean eu;

    @Column(name = "marki_img")
    private String marki_img;

    @Column(name = "modeli")
    @JsonDeserialize
    @OneToMany(mappedBy = "marki", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ModeliEntity> modeli;

}
