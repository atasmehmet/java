package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="Musteri")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Identity", nullable = false,updatable = false,insertable = false ,unique = true)
    private  long id;
    @Column(name="Adi",length=50, nullable=false, unique=false)
    private  String name;
    @Column(name="Soyadi",length=50, nullable=false, unique=false)
    private  String surname;
    @Column(name="TCKN",length=11, nullable=false, unique=false)
    private String identityNumber;
    @Column(name="Eposta",length=150, nullable=false, unique=false)
    private String email;
    @Column(name="Telefon",length=10, nullable=true, unique=false)
    private String phone;
    @Temporal(TemporalType.DATE)
    @Column(name="DogumTarihi", nullable=true, unique=false)
    private Date birthDate;

}
