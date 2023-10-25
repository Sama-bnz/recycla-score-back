package com.thomas.recyclascore.service;

import com.thomas.recyclascore.entities.Material;
import com.thomas.recyclascore.repository.IMaterialRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@RequiredArgsConstructor
@AllArgsConstructor
public class MaterialService {

    @Autowired
    private IMaterialRepository materialRepository;

    public List<Material> getAllMaterials() {
        return materialRepository.findAll();
    }
}
