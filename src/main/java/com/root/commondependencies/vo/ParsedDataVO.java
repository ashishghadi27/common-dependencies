package com.root.commondependencies.vo;

import lombok.Data;

import java.util.List;

@Data
public class ParsedDataVO {
    private List<ProductVO> productsList;
    private List<MonthlyPlanVO> monthlyPlanList;
    private List<ChildPartVO> childPartsList;
}
