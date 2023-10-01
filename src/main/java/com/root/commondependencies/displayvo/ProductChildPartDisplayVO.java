package com.root.commondependencies.displayvo;

import com.root.commondependencies.vo.ChildPartVO;
import lombok.Data;

import java.util.List;

@Data
public class ProductChildPartDisplayVO {
    private String productName;
    private String productSeries;
    List<ChildPartVO> childPartVOList;
}
