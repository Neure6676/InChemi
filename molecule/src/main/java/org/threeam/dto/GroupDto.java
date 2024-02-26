package org.threeam.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class GroupDto {

    @NotEmpty(message = "customerId can not be a null or empty")
    private Long customerId;

    @NotEmpty(message = "Group name can not be a null or empty")
    @Size(min = 1, max = 100, message = "The length of the customer name should be between 1 and 100")
    private String groupName;
}
