package com.moonshot.rob.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetEmployeeResponse {
    private Long id;

    private String name;

    private String position;

    private Integer salary;
}
