package org.threeam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.threeam.entity.Molecule;


@Repository
public interface MoleculeRepository extends JpaRepository<Molecule, Long> {

}
