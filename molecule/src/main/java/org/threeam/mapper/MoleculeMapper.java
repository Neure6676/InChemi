package org.threeam.mapper;

import org.threeam.dto.MoleculeDto;
import org.threeam.entity.Molecule;

import java.util.Optional;

public class MoleculeMapper {

    public static MoleculeDto mapToMoleculeDto(Molecule molecule) {
        if (molecule == null) {
            return null;
        }

        MoleculeDto dto = new MoleculeDto();
        dto.setAccountId(molecule.getAccountId());
        dto.setMoleculeName(molecule.getMoleculeName());
        dto.setMoleculeFormula(molecule.getMoleculeFormula());
        dto.setMoleculeDescription(molecule.getMoleculeDescription());
        dto.setMoleculeInchi(molecule.getMoleculeInchi());
        dto.setImgUrl(molecule.getImgUrl());
        dto.setMoleculeDetailId(molecule.getMoleculeDetailId());
        return dto;
    }

    public static Molecule mapToMolecule(MoleculeDto dto) {
        if (dto == null) {
            return null;
        }

        Molecule molecule = new Molecule();
        molecule.setAccountId(dto.getAccountId());
        molecule.setMoleculeName(dto.getMoleculeName());
        molecule.setMoleculeFormula(dto.getMoleculeFormula());
        molecule.setMoleculeDescription(dto.getMoleculeDescription());
        molecule.setMoleculeInchi(dto.getMoleculeInchi());
        molecule.setImgUrl(dto.getImgUrl());
        molecule.setMoleculeDetailId(dto.getMoleculeDetailId());
        return molecule;
    }

    public static Molecule mapToMolecule(MoleculeDto dto, Molecule molecule) {
        if (dto == null) {
            return null;
        }

        molecule.setAccountId(dto.getAccountId());
        molecule.setMoleculeName(dto.getMoleculeName());
        molecule.setMoleculeFormula(dto.getMoleculeFormula());
        molecule.setMoleculeDescription(dto.getMoleculeDescription());
        molecule.setMoleculeInchi(dto.getMoleculeInchi());
        molecule.setImgUrl(dto.getImgUrl());
        molecule.setMoleculeDetailId(dto.getMoleculeDetailId());
        return molecule;
    }
}
