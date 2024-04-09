package org.threeam.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class MoleculeDto {

    @NotEmpty(message = "Account id can not be a null or empty")
    private String accountId;

    @NotEmpty(message = "Molecule name can not be a null or empty")
    @Size(min = 1, max = 100, message = "The length of the molecule name should be between 1 and 100")
    private String moleculeName;

    @NotEmpty(message = "Molecule formula can not be a null or empty")
    @Size(min = 1, max = 50, message = "The length of the molecule formula should be between 1 and 50")
    private String moleculeFormula;

    @Size(max = 200, message = "The length of the molecule description should be less than 200")
    private String moleculeDescription;

    @NotEmpty(message = "Molecule InChI can not be a null or empty")
    @Size(min = 1, max = 300, message = "The length of the molecule InChI should be between 1 and 300")
    private String moleculeInchi;

    private String imgUrl;

    private Long moleculeDetailId;

}
