package org.threeam.service;

import org.threeam.dto.MoleculeDto;

import java.util.List;

public interface IMoleculeService {
    void createMolecule(MoleculeDto moleculeDto);

    List<MoleculeDto> fetchAllMolecules(String accountId);

    MoleculeDto fetchMoleculeDetail(Long moleculeId);

    boolean updateMolecule(MoleculeDto moleculeDto);

    boolean deleteMolecule(Long moleculeId);
}
