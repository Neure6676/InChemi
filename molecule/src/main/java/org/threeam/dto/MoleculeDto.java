package org.threeam.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class MoleculeDto {

    @NotEmpty(message = "customerId can not be a null or empty")
    private Long customerId;

    private String s3Location;

    private String formula;

    private String inchi;

}
