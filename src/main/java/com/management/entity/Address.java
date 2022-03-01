package com.management.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "city")
    private String city;
    @Column(name = "district")
    private String district;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "student_id")
//    private Student student;
}