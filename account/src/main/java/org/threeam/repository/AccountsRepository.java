package org.threeam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.threeam.entity.Accounts;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {}
