package com.management.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    private long id;
    @Column(name = "firstName", nullable = false)
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "email", nullable = false)
    private String email;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "add_id",referencedColumnName = "student_id")
    private List<Address> address;
}


