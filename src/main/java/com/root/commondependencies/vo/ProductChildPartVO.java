package com.root.commondependencies.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductChildPartVO {
    private Long id;
    private Long productId;
    private Long childPartId;
    private int childPartQuantity;
}
