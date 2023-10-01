package com.root.commondependencies.displayvo;

import com.root.commondependencies.vo.ChildPartWithCoverage;
import com.root.commondependencies.vo.CoverageVO;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class MonthlyDisplayVO {

    private String productSeries;
    private String productName;
    private int Week1;
    private int Week2;
    private int Week3;
    private int Week4;
    private int Total;
    private int OpeningStock;
    private int Dispatch;
    private int productionRFD;
    private List<ChildPartWithCoverage> childPartWithCoverageList;
    private CoverageVO coverageVO;



}
