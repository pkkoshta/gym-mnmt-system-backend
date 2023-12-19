package com.prashant.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "member")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int memberId;
    private String firstName;
    private String lastName;
    private int age;
    private String bloodGroup;
    private String gender;
    private double mobileNo;
    private String password;
    private String suscriptionType;
    private LocalDate dateOfBirth;

}
