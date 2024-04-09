package org.threeam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.threeam.entity.Molecule;

import java.util.List;
import java.util.Optional;


@Repository
public interface MoleculeRepository extends JpaRepository<Molecule, Long> {

    List<Molecule> findAllByAccountId(String accountId);

    Optional<Molecule> findByMoleculeInchi(String moleculeInchi);
}
