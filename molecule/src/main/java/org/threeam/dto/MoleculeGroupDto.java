package org.threeam.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class MoleculeGroupDto {

    @NotEmpty(message = "groupId can not be a null or empty")
    private Long groupId;

    @NotEmpty(message = "moleculeId can not be a null or empty")
    private Long moleculeId;
}
