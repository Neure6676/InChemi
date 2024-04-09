package org.threeam.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.threeam.dto.MoleculeDto;
import org.threeam.entity.Molecule;
import org.threeam.exception.ResourceNotFoundException;
import org.threeam.mapper.MoleculeMapper;
import org.threeam.repository.MoleculeRepository;
import org.threeam.service.IMoleculeService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MoleculeServiceImpl implements IMoleculeService {

    private MoleculeRepository moleculeRepository;

    @Override
    public void createMolecule(MoleculeDto moleculeDto) {
        Molecule molecule = MoleculeMapper.mapToMolecule(moleculeDto);
        moleculeRepository.save(molecule);
    }

    @Override
    public List<MoleculeDto> fetchAllMolecules(String accountId) {
        List<Molecule> moleculeList = moleculeRepository.findAllByAccountId(accountId);
        List<MoleculeDto> moleculeDtoList = moleculeList.stream().map(MoleculeMapper::mapToMoleculeDto).collect(Collectors.toList());
        return moleculeDtoList;
    }

    @Override
    public MoleculeDto fetchMoleculeDetail(Long moleculeId) {
        Molecule molecule = moleculeRepository.findById(moleculeId).orElseThrow(
                () -> new ResourceNotFoundException("Molecule", "MoleculeId", String.valueOf(moleculeId))
        );
        MoleculeDto moleculeDto = MoleculeMapper.mapToMoleculeDto(molecule);
        return moleculeDto;
    }

    @Override
    public boolean updateMolecule(MoleculeDto moleculeDto) {
        boolean isUpdated = false;
        if(moleculeDto !=null ){
            String inchi = moleculeDto.getMoleculeInchi();
            Molecule tarMolecule = moleculeRepository.findByMoleculeInchi(inchi).orElseThrow(
                    () -> new ResourceNotFoundException("Molecule", "MoleculeInchi", inchi)
            );
            MoleculeMapper.mapToMolecule(moleculeDto, tarMolecule);
            moleculeRepository.save(tarMolecule);
            isUpdated = true;
        }
        return  isUpdated;
    }

    @Override
    public boolean deleteMolecule(Long moleculeId) {
        Molecule molecule = moleculeRepository.findById(moleculeId).orElseThrow(
                () -> new ResourceNotFoundException("Molecule", "MoleculeId", String.valueOf(moleculeId))
        );
        moleculeRepository.deleteById(molecule.getMoleculeId());
        return true;
    }


}
