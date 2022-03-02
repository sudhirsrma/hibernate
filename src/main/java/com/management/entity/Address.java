package com.management.entity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "city")
    private String city;
    @Column(name = "district")
    private String district;


}