package org.threeam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Molecule extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long moleculeId;

    private String accountId;

    private String moleculeName;

    private String moleculeFormula;

    private String moleculeDescription;

    private String moleculeInchi;

    private String imgUrl;

    private Long moleculeDetailId;
}
