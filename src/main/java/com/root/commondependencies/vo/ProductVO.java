package com.root.commondependencies.vo;

import lombok.Data;

import java.util.Map;

@Data
public class ProductVO {
    private String productName;
    private String productSeries;
    private Integer productOpeningStock;
    private Map<String,Integer> childParts;
}
