package org.threeam.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class GroupDto {

    @NotEmpty(message = "Account id can not be a null or empty")
    private Long accountId;

    @NotEmpty(message = "Group name can not be a null or empty")
    @Size(min = 1, max = 100, message = "The length of the customer name should be between 1 and 100")
    private String groupName;

    @Size(max = 200, message = "The length of the group description should be less than 200")
    private String groupDescription;
}
