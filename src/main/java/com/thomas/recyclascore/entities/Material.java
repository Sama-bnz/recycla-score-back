package com.thomas.recyclascore.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;

@Data
@Entity
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Column(name = "material", nullable = false, length = 50)
    private String material;
    @Column(name = "indexRecyclability", nullable = false, length = 50)
    private int indexRecyclability;
    @Column(name = "isrecyclable", nullable = false, length = 50)
    private String isrecyclable;


}
