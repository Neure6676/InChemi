package org.threeam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.threeam.entity.Group;

import java.util.Optional;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {

}
