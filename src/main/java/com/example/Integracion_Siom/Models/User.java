package com.example.Integracion_Siom.Models;

import lombok.*;

import javax.persistence.*;

@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class User {

    @Id
    String id;
    String authID;
    String name;
    String firstName;
    String lastName;
    String email;
    Enum status;
    String role;
    Group[] group;
    OrganizationFk[] organizationFk;
}
