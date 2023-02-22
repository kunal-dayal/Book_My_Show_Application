package com.example.Book_My_Show_Application.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int age;

    @NonNull
    @Column(unique = true,nullable = false)
    private String email;


    private String mobNo;

    private String address;

}
