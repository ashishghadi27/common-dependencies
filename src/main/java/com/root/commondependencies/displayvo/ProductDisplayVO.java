package com.root.commondependencies.displayvo;

import lombok.Data;

@Data
public class ProductDisplayVO {
    private Long productID;
    private String productName;
    private String productSeries;
    private Integer productOpeningStock;
}
