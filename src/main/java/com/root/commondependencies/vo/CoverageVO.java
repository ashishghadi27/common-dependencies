package com.root.commondependencies.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CoverageVO {

    private int coverageWeek1;
    private int coverageWeek2;
    private int coverageWeek3;
    private int coverageWeek4;
    private int coverageTotal;
}
