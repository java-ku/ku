package com.java.ku.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CompanyDto {
    private String taxNumber;
}
