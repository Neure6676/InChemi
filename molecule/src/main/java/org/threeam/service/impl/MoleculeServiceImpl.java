package org.threeam.service.impl;

import org.threeam.dto.MoleculeDto;
import org.threeam.entity.Molecule;
import org.threeam.repository.MoleculeRepository;
import org.threeam.service.IMoleculeService;

import java.util.List;


public class MoleculeServiceImpl implements IMoleculeService {

    private MoleculeRepository moleculeRepository;

    @Override
    public void createMolecule(String customerId) {
        // TODO s3 upload, lambda
        moleculeRepository.save(new Molecule());
    }

    @Override
    public MoleculeDto fetchMolecule(String inchi) {
        return null;
    }

    @Override
    public boolean updateMolecule(MoleculeDto moleculeDto) {
        return false;
    }

    @Override
    public boolean deleteMolecule(String inchi) {
        return false;
    }

    @Override
    public List<MoleculeDto> fetchMoleculeByPage(String customerId) {
        return null;
    }


}
