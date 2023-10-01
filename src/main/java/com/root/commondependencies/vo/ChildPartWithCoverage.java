package com.root.commondependencies.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChildPartWithCoverage {
    private Long childPartId;
    private String childPartName;
    private String childPartSeries;
    private Integer childPartQuantity;
    ChildPartsCoverageVO childPartCoverage;
}
