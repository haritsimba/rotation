package com.project.telecom.rnu.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String libelle;

    @OneToMany(mappedBy = "resource", cascade = CascadeType.REMOVE, orphanRemoval = true)
    List<Creneau> creneaux = new ArrayList<>();

}
