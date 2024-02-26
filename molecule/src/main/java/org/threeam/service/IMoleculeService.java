package org.threeam.service;

import org.springframework.stereotype.Service;
import org.threeam.dto.MoleculeDto;

import java.util.List;

@Service
public interface IMoleculeService {
    void createMolecule(String customerId);

    MoleculeDto fetchMolecule(String inchi);

    boolean updateMolecule(MoleculeDto moleculeDto);

    boolean deleteMolecule(String inchi);

    List<MoleculeDto> fetchMoleculeByPage(String customerId);
}
