package com.thomas.recyclascore.repository;

import com.thomas.recyclascore.entities.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMaterialRepository extends JpaRepository<Material, Integer> {

}


